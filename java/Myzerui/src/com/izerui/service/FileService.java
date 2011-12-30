package com.izerui.service;

import java.util.List;

import com.izerui.vo.FileItem;
import com.izerui.vo.FileTree;

public interface FileService {
	/**
	 * 获取文件夹list tree
	 * @return
	 */
	public List<FileTree> getFolderList();
	
	/**
	 * 根据目录列出当前目录下文件
	 * @param folderPath
	 * @return
	 */
	public List<FileItem> listFilesByFolder(String folderPath);
	/**
	 * 不是新建就是删除
	 * @param path
	 * @param isCreate
	 */
	public String optFolder(String path,boolean isCreate) throws Exception;
	
	/**
	 * 重命名文件夹
	 * @param path 文件路径
	 * @param FolderNewName 最底层目录的新名字
	 * @return 新的文件夹路径
	 */
	public String renameFolder(String path,String FolderNewName);
}