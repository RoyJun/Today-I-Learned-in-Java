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
			String memo="�� ������ ����˴ϴ�. �� ���� ���� ������ ������ �ڹٱ������� ����";
			fileOS.write(memo.getBytes());
			fileOS.close();
			System.out.println("save.txt ������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ������ �� �����ϴ�.");
		}

	}

}
