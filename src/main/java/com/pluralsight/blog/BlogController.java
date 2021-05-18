package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BlogController {
    private PostRepository postRepository;

    public void postRepository(PostRepository){
        return;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap) {
        getAllPosts();
        modelMap.put("title", "Blog Post 1");
        return "home";
    }
}
