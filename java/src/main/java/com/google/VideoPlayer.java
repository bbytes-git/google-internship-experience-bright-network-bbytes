package com.google;
// Tonia B. Biokoro

import java.util.*;
import java.util.stream.Collectors;


public class VideoPlayer {
  private Video playingVideo;
  private final VideoLibrary videoLibrary;
  private boolean paused = false;


  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Below is a list of all available videos");
   List<Video> videos = videoLibrary.getVideos();
    // [1] For-each loop in Javahttps://www.geeksforgeeks.org/for-each-loop-in-java/
   for (Video video : videos){
     // [2] Joining Two Collections https://www.baeldung.com/java-join-and-split
     System.out.println(video.getTitle() + " (" + video.getVideoId() + ") [" + video.getTags().stream().collect(Collectors.joining(" ")) + "]%n");
    }
  }

  public void playVideo(String videoId) {

    Video video = videoLibrary.getVideo(videoId);
    if (video == null) {
      System.out.println("This video does not exist");
    }else{
      endVideoPlaying();
      runTheVideo(video);

    }

  }

  private void runTheVideo(Video video) {
    if (video != null) {
      System.out.println(video.getTitle());
    }

  }


  private void runTheVideo(Video video, String videoId) {
    if (video != null) {
      videoId = video.getVideoId();
    }
    System.out.println(video.getVideoId());
    
  }


  private void endVideoPlaying() {

    if (playingVideo == null) {
      System.out.printf(" ");

    }else {
      System.out.printf("Ending video: %s%n", playingVideo.getTitle());

    }


  }
  Map<String, String> flagVid = new HashMap<>();


  public void stopVideo() {

    if (playingVideo != null){

    }
    System.out.println("Must implement endVideoPlaying");
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    if (playingVideo != null) {

    }
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }
// me
  public void showPlaying() {
    if (playingVideo != null) {

      System.out.println("Video playing is: " + playingVideo.getVideoId());
    }
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }


  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}
