package ru.diploma.eduCenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.forms.NewsForm;
import ru.diploma.eduCenter.models.News;
import ru.diploma.eduCenter.repositories.NewsRepository;
import ru.diploma.eduCenter.transfer.NewsDto;

import java.time.LocalDate;
import java.util.List;

@Service
public class NewsPageServiceImpl implements NewsPageService {

    @Autowired
    NewsRepository repository;

    @Override
    public List<NewsDto> getNews() {
        return NewsDto.from(repository.findAll());
    }

    @Override
    public void addNews(NewsForm newsForm) {
        News news = News.builder()
                .title(newsForm.getTitle())
                .description((newsForm.getDescription()))
                .date(LocalDate.now())
                .build();
        repository.save(news);
    }
}
