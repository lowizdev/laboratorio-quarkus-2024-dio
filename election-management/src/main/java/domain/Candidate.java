package domain;

import java.util.Optional;

public record Candidate(String id, String givenName, String email, Optional<String> phone) {
}
