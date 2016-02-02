package knox.spring.data.neo4j.domain;

import java.util.Set;

import org.neo4j.ogm.annotation.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class Commit {
	
    @GraphId
    Long id;
    
    String commitID;
    
    @Relationship(type = "CONTAINS") 
    Set<CommitToSpace> commitToNode;
    
    public Commit() {
    	
    }
    
    public Set<CommitToSpace> getCommitToNode() {
    	return commitToNode;
    }

    public String getCommitID() {
    	return commitID;
    }
}