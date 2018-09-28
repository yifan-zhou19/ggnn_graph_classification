package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			 String p;
			 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
			 p = new Scanner(System.in).nextLine();
			 String p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
			 for (i = 0;i < p.length() - 1;i++)
			 {

					 *(p1.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			 }
			 *(p1.Substring(i)) = p + *(p.Substring(i));
			 for (i = 0;i < p.length();i++)
			 {
			 System.out.printf("%c",*(p1.Substring(i)));
			 }


	}

}
