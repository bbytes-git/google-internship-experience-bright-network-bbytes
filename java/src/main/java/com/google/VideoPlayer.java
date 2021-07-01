package com.google;
// T.B.Biokoro

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
    System.out.println("Here are the availble videos");
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
      System.out.println("Video cannot start: video does not exist");
    }else{
      endVideoPlaying();
      runTheVideo(video);

    }

  }
// [3] https://github.com/Lengjunyi/internship-experience-uk-google-work-sample
  private void runTheVideo(Video video) {
    assert video != null;
    String videoId = video.getVideoId();
    if(flagVid.containsKey(videoId)) {
      System.out.printf("Cannot play video: video is flags (reason: %s)%n",
              flagVid.get(videoId));
      return;
    }
    System.out.printf("Playing video: %s%n", video.getTitle());
    playingVideo = video;
    paused = false;

  }


  private void endVideoPlaying() {

    if (playingVideo != null) {
      System.out.printf("Ending video: %s%n", playingVideo.getTitle());
    }
    playingVideo = null;
  }
  Map<String, String> flagVid = new HashMap<>();


  public void stopVideo() {
    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
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

    Video video = videoLibrary.getVideo(videoId);
    if (video != null) {
      if (playingVideo != null && playingVideo.getVideoId().equals(videoId)) {
        endVideoPlaying();
      }
      if (flagVid.containsKey(videoId)) {
        System.out.println("Cannot flag video: Video is already flagged");
      } else {
        flagVid.put(videoId, reason);
        System.out.printf("Successfully flagged video: %s (reason: %s)%n",
                video.getTitle(), reason);
      }
    } else {
      System.out.println("Cannot flag video: Video does not exist");
    }
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}