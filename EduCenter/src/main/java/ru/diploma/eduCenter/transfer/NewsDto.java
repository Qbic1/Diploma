package ru.diploma.eduCenter.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.diploma.eduCenter.models.News;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Builder
public class NewsDto {
    private String title;
    private String description;
    private LocalDate date;

    public static NewsDto from(News news) {
        return NewsDto.builder()
                .title(news.getTitle())
                .description(news.getDescription())
                .date(news.getDate())
                .build();
    }

    public static List<NewsDto> from(List<News> news) {
        return news.stream().map(NewsDto::from).collect(Collectors.toList());
    }
}
