package com.laptrinhJava.demo.Model;

import jakarta.persistence.*;
import lombok.*;
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanvien")
public class Nhanvien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gt;
    private String noisinh;
    private String maphong;
    private int luong;
    @ManyToOne
    @JoinColumn(name = "maphong_id")
    private Phongban phongban;

    }

