package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int n;
	 int k;
	 int m;
	 String p;
	 String q;
	 char l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	 p = new Scanner(System.in).nextLine();
	 m = p.length();
	 for (i = 0,j = 0;i < m - 1;i++,j++)
	 {
		 *(q.Substring(j)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		 System.out.printf("%c",*(q.Substring(j)));
	 }
	 l = p + *(p.Substring(m) - 1);
	 System.out.printf("%c",l);
	}
}
