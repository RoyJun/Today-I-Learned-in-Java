package javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputEx1 {

	public static void main(String[] args) {
		File saveFile = new File("C:\\UngJunChoe\\javaproject\\file\\save.txt");
		try {
			FileOutputStream fileOS = new FileOutputStream(saveFile);
			String memo="이 내용이 저장됩니다. 이 파일 저장 수업이 끝나면 자바구현수업 시작";
			fileOS.write(memo.getBytes());
			fileOS.close();
			System.out.println("save.txt 파일이 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다.");
		}

	}

}
