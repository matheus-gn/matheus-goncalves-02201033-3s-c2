package com.example.matheusgoncalvesac2.repositorio;

import com.example.matheusgoncalvesac2.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LutadorRepository extends JpaRepository <Lutador,Integer> {

List<Lutador> findAllByOrderByForcaGolpeDesc();

List<Lutador> findAllByVivoTrue();

List<Lutador> findAllByVivoFalse();




}
