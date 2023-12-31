/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.usj.musicquizz.api;

import com.usj.musicquizz.invoker.ApiException;
import com.usj.musicquizz.model.Song;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SongsServiceApi
 */
@Disabled
public class SongsServiceApiTest {

    private final SongsServiceApi api = new SongsServiceApi();

    /**
     * findAll
     *
     * Endpoint to return the whole list of songs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllTest() throws ApiException {
        List<Song> response = api.findAll();
        // TODO: test validations
    }

    /**
     * getById
     *
     * Endpoint to get one song by its id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        Integer id = null;
        Song response = api.getById(id);
        // TODO: test validations
    }

}
