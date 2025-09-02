package com.DL4J.player_performance_ai.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PlayerPerformance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double average;
    private double strikeRate;
    private double bowlingAverage;
    private double economyRate;
    private int fieldingStats;
    private int label;  // 1 for good, 0 for bad
        // Explicit setters for compatibility
        public void setId(Long id) { this.id = id; }
        public void setAverage(double average) { this.average = average; }
        public void setStrikeRate(double strikeRate) { this.strikeRate = strikeRate; }
        public void setBowlingAverage(double bowlingAverage) { this.bowlingAverage = bowlingAverage; }
        public void setEconomyRate(double economyRate) { this.economyRate = economyRate; }
        public void setFieldingStats(int fieldingStats) { this.fieldingStats = fieldingStats; }
        public void setLabel(int label) { this.label = label; }
        // Explicit getters for compatibility
        public Long getId() { return id; }
        public double getAverage() { return average; }
        public double getStrikeRate() { return strikeRate; }
        public double getBowlingAverage() { return bowlingAverage; }
        public double getEconomyRate() { return economyRate; }
        public int getFieldingStats() { return fieldingStats; }
        public int getLabel() { return label; }
}
