import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\f1.txt");
			String uname="mohamed";
			byte s[]=uname.getBytes();
			fos.write(s);
			System.out.println("FileInserted...");
		}
		catch(FileNotFoundException r)
		{
			
		}
	}
	void readData() throws IOException
	{
	    FileInputStream fis=new FileInputStream("D:\\f1.txt");
	    int i;
	    while((i=fis.read())!=-1)
	    {
	       System.out.print((char)i);	
	    }
	}
	void copyFile() throws IOException
	{
		FileInputStream f1=new FileInputStream("D:\\f1.txt");
		FileOutputStream f2=new FileOutputStream("D:\\f2.txt");
		int i;
		while((i=f1.read())!=-1) {
			
			f2.write((byte)i);
		}
		System.out.println("DataUpdated..");
	}
	void readSeqFile() throws IOException
	{
		FileInputStream f1=new FileInputStream("D:\\f1.txt");
		FileInputStream f2=new FileInputStream("D:\\f2.txt");
		FileOutputStream f3=new FileOutputStream("D:\\f3.txt");
		SequenceInputStream sis=new SequenceInputStream(f1,f2);
		int i;
		while((i=sis.read())!=-1)
		{
		    //System.out.print((char)i);
			f3.write((byte)i);
		}
			
		
		
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		//f1.writeData();
         // f1.readData();
		//f1.copyFile();
		f1.readSeqFile();
	}

}
