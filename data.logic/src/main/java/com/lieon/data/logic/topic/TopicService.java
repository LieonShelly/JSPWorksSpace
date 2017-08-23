package com.lieon.data.logic.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			  new Topic("spring", "Spring", "Spring"),
			  new Topic("java", "Spring", "Spring"),
			  new Topic("swift", "Spring", "Spring"),
			  new Topic("js", "Spring", "Spring")
			  ));
	
	public List<Topic> getAllTopics() {
		  return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		for( int i = 0; i < topics.size(); i++) {
			Topic t =topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
	}
	
	public void deleteTopic(String id) {
		for( int i = 0; i < topics.size(); i++) {
			Topic t =topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
				break;
			}
		}
	}
}
