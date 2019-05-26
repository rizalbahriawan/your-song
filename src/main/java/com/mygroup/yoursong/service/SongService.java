/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygroup.yoursong.service;

import org.springframework.stereotype.Service;
import com.mygroup.yoursong.model.Song;
import java.util.List;
/**
 *
 * @author rizal
 */
public interface SongService {
    Song findById(long id);
	
    Song findByTitle(String title);

    Song findByAuthor(String author);

    void saveSong(Song song);

    void updateSong(Song song);

    void deleteSongById(long id);

    List<Song> findAllSongs(); 

    void deleteAllSongs();

    public boolean isSongExist(Song user);
}
