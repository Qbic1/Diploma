package ru.diploma.eduCenter.services;

import ru.diploma.eduCenter.forms.NewsForm;
import ru.diploma.eduCenter.transfer.NewsDto;

import java.util.List;

public interface NewsPageService {
    List<NewsDto> getNews();
    void addNews(NewsForm newsForm);
}
