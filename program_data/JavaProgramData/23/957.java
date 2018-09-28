package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String p;
	 String q = new String(new char[20]);
	 int i = 0;
	 int j = 0;
	 int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	 q = (String)calloc(50,(Character.SIZE / Byte.SIZE) * 20);
	 p = new Scanner(System.in).nextLine();
	 for (k = 0;k < p.length();k++)
	 {
		 if (*(p.Substring(k)) != ' ')
		 {
		  *(*(q.Substring(i)) + j) = *(p.Substring(k));
		  j++;
		 }
	  else
	  {
		  i++,j = 0;
	  }
	 }
	 for (k = i;k > 0;k--)
	 {
	 System.out.printf("%s ",*(q.Substring(k)));
	 }
	 System.out.printf("%s",*q);
	}
}
