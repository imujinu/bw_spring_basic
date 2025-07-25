package com.beyond.basic.b2_board.post.dto;

import com.beyond.basic.b2_board.author.domain.Author;
import com.beyond.basic.b2_board.post.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDetailDto {
    private Long id;
    private String title;
    private String contents;
    private String authorEmail;
    private String category;
//    public static  PostDetailDto fromEntity(Post post, Author author){
//        return PostDetailDto.builder()
//                .id(post.getId())
//                .title(post.getTitle())
//                .contents(post.getContents())
//                .authorEmail(author.getEmail())
//                .build();
//    }
    public static PostDetailDto fromEntity(Post post){

        return PostDetailDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .contents(post.getContents())
                .category(post.getCategory())
                .authorEmail(post.getAuthor().getEmail())
                .build();
    }
}
