package mainPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainStartClass {
	public static void main(String[] args){
		
		List list = new  ArrayList<>();
		System.out.println(getListOfAllFilesInAFolderAndSubFolder("F:\\WindowsApps", list));
		
		// empty line
		// added another empty line
		
		System.out.println("Hello World random java code");
		for(int i = 0; i < 10 ; i++){
			i = i + 1;
			System.out.println(i + " :is the current run");
			
		}
		
		DummyCommitClass test = new DummyCommitClass();
		test.setTestString("this is a simple test to ...");
		System.out.println(test.getTestString());
		
		System.out.println("          ");
		System.out.println("This string only apears if the last push was successful");
		System.out.println("          ");
	}
	
	private static List<File> getListOfAllFilesInAFolderAndSubFolder(String path, List<File> allFilesInAFolderAndSubFolder) {
		File directory = new File(path);
		File[] fileList = directory.listFiles();

		if (fileList != null) {
			for (int i = 0; i < fileList.length; i++) {
				if (fileList[i].isFile()) {
					allFilesInAFolderAndSubFolder.add(fileList[i]);
				} else if (fileList[i].isDirectory()) {
					getListOfAllFilesInAFolderAndSubFolder(fileList[i].getAbsolutePath(), allFilesInAFolderAndSubFolder);
					// add of directory
					allFilesInAFolderAndSubFolder.add(fileList[i]);
				}
			}
		}
		return allFilesInAFolderAndSubFolder;
	}
	
}

