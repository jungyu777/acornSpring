package com.gura.spring04.file.dao;

import java.util.List;

import com.gura.spring04.file.dto.FileDto;

public interface FileDao {
	void insert(FileDto dto);
	FileDto getData(int num);
	void delete(int num);
	List<FileDto> getList(FileDto dto);
	int getCount(FileDto dto);
}
