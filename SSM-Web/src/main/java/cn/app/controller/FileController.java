package cn.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/upload")
    public ModelAndView uploadFile(@RequestParam(value="file",required = false) MultipartFile file,
                                   HttpServletResponse response,
                                   HttpServletRequest request){
        if(!file.isEmpty()){
            String path = request.getServletContext().getRealPath("/") + "\\fileUpload";
            System.out.println("realpath:" + path);
            String name = file.getOriginalFilename();
            File destFile = new File(path,name);
            try {
                file.transferTo(destFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 访问的url
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() +
                    request.getContextPath() + "/" + name;
            System.out.println(url);
        }
        return null;
    }
}
