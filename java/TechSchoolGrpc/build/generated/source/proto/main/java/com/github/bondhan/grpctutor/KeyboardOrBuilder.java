// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.github.bondhan.grpctutor;

public interface KeyboardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.bondhan.grpctutor.Keyboard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.github.bondhan.grpctutor.Keyboard.Layout layout = 1;</code>
   * @return The enum numeric value on the wire for layout.
   */
  int getLayoutValue();
  /**
   * <code>.com.github.bondhan.grpctutor.Keyboard.Layout layout = 1;</code>
   * @return The layout.
   */
  com.github.bondhan.grpctutor.Keyboard.Layout getLayout();

  /**
   * <code>bool backlit = 2;</code>
   * @return The backlit.
   */
  boolean getBacklit();
}
