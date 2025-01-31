package hs.com.hyeongseok.word.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

//@Documented(collection = "words")
@RequiredArgsConstructor
@Builder
@Data
public class Word {

    // MongoDb wordId
    private String wordId;

    // word
    private String word;

    // 발음
    private String pronunciation;

    // 의미 리스트
    private List<Meaning> meanings;

    // 생성 날짜
    private LocalDateTime createdAt;
}
