package com.example.demo;

import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.modules.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Optional;

import static java.util.Objects.isNull;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Nested
@ExtendWith(MockitoExtension.class)
class MockitoTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @Spy
    private User user = new User(1);
    @Mock
    private WebClient webClient;
    @Mock
    private WebClient.RequestBodyUriSpec uriSpec;

    @Mock
    private WebClient.RequestHeadersSpec headersSpec;

    @Mock
    private WebClient.ResponseSpec responseSpec;
    @Mock
    private WebClient.Builder webClientBuilder;
    @Mock
    private WebClient webClientMock;
    @Mock
    private WebClient.RequestBodyUriSpec RequestBodyUriSpec;
    @Mock
    private WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;
    @Test
    public void testSpy() {
        user.setAge(1);
        verify(user).setAge(1);

    }

    @Test
    public void testFind() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        assertThat(userService.find(1L)).isNull();

    }

    @Test
    public void testThat() {
        when(userRepository.save(user)).thenReturn(user);
        User saveUser = userService.save(user);
        assertEquals(133, saveUser.getAge());
    }

    @Test
    public void testAll() {
        when(userRepository.save(user)).thenReturn(user);
        User saveUser = userService.save(user);
        assertAll(() -> assertThat(saveUser).isNotNull(), () -> assertThat(saveUser.getAge()).isEqualTo(2));
    }


}
