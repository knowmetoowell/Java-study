package net.developia.spring01.article.controller;

import net.developia.spring01.article.dto.ArticleDTO;
import net.developia.spring01.article.service.ArticleService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ArticleDetail extends AbstractController {
    ArticleService service = ArticleService.getInstance();
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long no = Long.parseLong(request.getParameter("no"));
        try{
            ArticleDTO dto = service.getDetail(no);
            return new ModelAndView("/WEB-INF/views/article/detail.jsp","dto",dto);
        } catch (Exception e){
            ModelAndView mav = new ModelAndView("/WEB-INF/views/article/result.jsp");
            mav.addObject("msg", e.getMessage());
            mav.addObject("url", "");
            return mav;
        }
    }
}
