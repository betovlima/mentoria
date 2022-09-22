package br.com.mentoria.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@RestController
@Slf4j
@RequiredArgsConstructor
@Api(tags = "Mentoria")
@RequestMapping("/mentoria/v1")
public class Controller {

    @ApiOperation(value = "Lista pets")
    @GetMapping(path = "/lista")
    public ResponseEntity lista() {
        return ResponseEntity.ok().build();
    }
}
