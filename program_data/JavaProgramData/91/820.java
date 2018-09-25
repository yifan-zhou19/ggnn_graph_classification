package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		String q = a;
		String p;
	   int i;
	   int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
	   q = new Scanner(System.in).nextLine();
	   m = a.length();
	   for (i = 0;i < m - 1;i++)
	   {
		   *(p.Substring(i)) = *(q.Substring(i)) + *(q.Substring(i) + 1);
	   }
	   *(p.Substring(m) - 1) = *(q.Substring(m) - 1) + q;
	   System.out.printf("%s",p);
	}

}
