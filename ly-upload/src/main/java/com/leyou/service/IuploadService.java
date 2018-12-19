package com.leyou.service;

import org.springframework.web.multipart.MultipartFile; /**
 * @author Ocean
 * @date 2018-12-19 19:44
 * @descrition
 */
public interface IuploadService {

    String uploadImage(MultipartFile file);
}
