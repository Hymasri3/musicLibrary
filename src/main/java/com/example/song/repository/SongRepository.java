// Write your code here
package com.example.song.repository;
import java.util.*;
import com.example.song.model.Song;
public interface SongRepository{
    public ArrayList<Song> getSongs();
    public Song getSong(int songId);
    public Song addSong(Song song);
    public Song updateSong(int songId,Song song);
    public void  deleteSong(int songId);
}