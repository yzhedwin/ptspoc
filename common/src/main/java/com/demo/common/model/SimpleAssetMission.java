package com.demo.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimpleAssetMission {
    int id;
    String title;
    long absoluteStartTimeEpochMs;
    long durationMs;
}