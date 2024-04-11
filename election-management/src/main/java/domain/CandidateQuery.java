package domain;

import org.inferred.freebuilder.FreeBuilder;

import java.util.Optional;
import java.util.Set;

@FreeBuilder
public interface CandidateQuery {


    Optional<String> name();
    Optional<Set<String>> ids();

    class Builder extends CandidateQuery_Builder{}

}
