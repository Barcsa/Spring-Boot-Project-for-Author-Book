//package com.barcsa.database.controllers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import javax.swing.*;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//@AutoConfigureMockMvc
//public class AuthorControllerIntegrationTests {
//
//    private MockMvc mockMvc;
//
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    public AuthorControllerIntegrationTests(MockMvc mockMvc) {
//        this.mockMvc = mockMvc;
//        this.objectMapper = new ObjectMapper();
//    }
//
//    @Test
//    public void testThatCreateAuthorSuccessfullyReturnHttp201Created(){
//        mockMvc.perform(MockMvcRequestBuilders.post("/authors")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content()
//    }
//
//}
