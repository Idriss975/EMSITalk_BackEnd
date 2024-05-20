package com.programming.Idriss.EMSITALK.mapper;

import com.programming.Idriss.EMSITALK.dto.TopicDto;
import com.programming.Idriss.EMSITALK.model.Post;
import com.programming.Idriss.EMSITALK.model.Topic;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TopicMapper {

    @Mapping(target = "numberOfPosts", expression = "java(mapPosts(topic.getPosts()))")
    TopicDto mapTopicToDto(Topic topic);

    default Integer mapPosts(List<Post> numberOfPosts) {
        return numberOfPosts.size();
    }

    @InheritInverseConfiguration
    @Mapping(target = "posts", ignore = true)
    Topic mapDtoToTopic(TopicDto topicDto);
}
