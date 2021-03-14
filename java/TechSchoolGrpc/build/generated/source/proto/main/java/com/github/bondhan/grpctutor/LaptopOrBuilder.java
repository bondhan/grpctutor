// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_message.proto

package com.github.bondhan.grpctutor;

public interface LaptopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.bondhan.grpctutor.Laptop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string brand = 2;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 2;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.com.github.bondhan.grpctutor.CPU cpu = 4;</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.com.github.bondhan.grpctutor.CPU cpu = 4;</code>
   * @return The cpu.
   */
  com.github.bondhan.grpctutor.CPU getCpu();
  /**
   * <code>.com.github.bondhan.grpctutor.CPU cpu = 4;</code>
   */
  com.github.bondhan.grpctutor.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>.com.github.bondhan.grpctutor.Memory ram = 5;</code>
   * @return Whether the ram field is set.
   */
  boolean hasRam();
  /**
   * <code>.com.github.bondhan.grpctutor.Memory ram = 5;</code>
   * @return The ram.
   */
  com.github.bondhan.grpctutor.Memory getRam();
  /**
   * <code>.com.github.bondhan.grpctutor.Memory ram = 5;</code>
   */
  com.github.bondhan.grpctutor.MemoryOrBuilder getRamOrBuilder();

  /**
   * <code>repeated .com.github.bondhan.grpctutor.GPU gpus = 6;</code>
   */
  java.util.List<com.github.bondhan.grpctutor.GPU> 
      getGpusList();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.GPU gpus = 6;</code>
   */
  com.github.bondhan.grpctutor.GPU getGpus(int index);
  /**
   * <code>repeated .com.github.bondhan.grpctutor.GPU gpus = 6;</code>
   */
  int getGpusCount();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.GPU gpus = 6;</code>
   */
  java.util.List<? extends com.github.bondhan.grpctutor.GPUOrBuilder> 
      getGpusOrBuilderList();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.GPU gpus = 6;</code>
   */
  com.github.bondhan.grpctutor.GPUOrBuilder getGpusOrBuilder(
      int index);

  /**
   * <code>repeated .com.github.bondhan.grpctutor.Storage storages = 7;</code>
   */
  java.util.List<com.github.bondhan.grpctutor.Storage> 
      getStoragesList();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.Storage storages = 7;</code>
   */
  com.github.bondhan.grpctutor.Storage getStorages(int index);
  /**
   * <code>repeated .com.github.bondhan.grpctutor.Storage storages = 7;</code>
   */
  int getStoragesCount();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.Storage storages = 7;</code>
   */
  java.util.List<? extends com.github.bondhan.grpctutor.StorageOrBuilder> 
      getStoragesOrBuilderList();
  /**
   * <code>repeated .com.github.bondhan.grpctutor.Storage storages = 7;</code>
   */
  com.github.bondhan.grpctutor.StorageOrBuilder getStoragesOrBuilder(
      int index);

  /**
   * <code>.com.github.bondhan.grpctutor.Screen screen = 8;</code>
   * @return Whether the screen field is set.
   */
  boolean hasScreen();
  /**
   * <code>.com.github.bondhan.grpctutor.Screen screen = 8;</code>
   * @return The screen.
   */
  com.github.bondhan.grpctutor.Screen getScreen();
  /**
   * <code>.com.github.bondhan.grpctutor.Screen screen = 8;</code>
   */
  com.github.bondhan.grpctutor.ScreenOrBuilder getScreenOrBuilder();

  /**
   * <code>.com.github.bondhan.grpctutor.Keyboard keyboard = 9;</code>
   * @return Whether the keyboard field is set.
   */
  boolean hasKeyboard();
  /**
   * <code>.com.github.bondhan.grpctutor.Keyboard keyboard = 9;</code>
   * @return The keyboard.
   */
  com.github.bondhan.grpctutor.Keyboard getKeyboard();
  /**
   * <code>.com.github.bondhan.grpctutor.Keyboard keyboard = 9;</code>
   */
  com.github.bondhan.grpctutor.KeyboardOrBuilder getKeyboardOrBuilder();

  /**
   * <code>double weight_kg = 10;</code>
   * @return Whether the weightKg field is set.
   */
  boolean hasWeightKg();
  /**
   * <code>double weight_kg = 10;</code>
   * @return The weightKg.
   */
  double getWeightKg();

  /**
   * <code>double weight_lb = 11;</code>
   * @return Whether the weightLb field is set.
   */
  boolean hasWeightLb();
  /**
   * <code>double weight_lb = 11;</code>
   * @return The weightLb.
   */
  double getWeightLb();

  /**
   * <code>double price_usd = 12;</code>
   * @return The priceUsd.
   */
  double getPriceUsd();

  /**
   * <code>uint32 release_year = 13;</code>
   * @return The releaseYear.
   */
  int getReleaseYear();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  public com.github.bondhan.grpctutor.Laptop.WeightCase getWeightCase();
}