/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygroup.yoursong.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;   

import com.mygroup.yoursong.model.Song;
/**
 *
 * @author rizal
 */
public class SongServiceImpl implements SongService{
    
    @Service("songService")
    @Transactional
}
