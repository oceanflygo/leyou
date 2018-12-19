package com.leyou.controller;

import com.leyou.service.IuploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ocean
 * @date 2018-12-19 19:41
 * @descrition
 */
@RestController
@RequestMapping("upload")
public class UploadController {
    @Autowired
    private IuploadService uploadService;
    @PostMapping("image")
    public ResponseEntity<String> UploadImage(@RequestParam("file") MultipartFile file){
        String url =uploadService.uploadImage(file);
        return ResponseEntity.ok(url);

    }
}
