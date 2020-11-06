package sys.app.onlinenotes.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@RedisHash("NOTES")
public class Note implements Serializable{
	@Id
	@Indexed
	private  String id;

	private  String subject;
	
	private  String description;
	
	private  String type;	
}