package com.myspringboot.filestorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspringboot.filestorage.model.File;

public interface FileRepository extends JpaRepository<File, String> {
}
