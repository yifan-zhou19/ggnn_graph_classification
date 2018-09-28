package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
	   String s = new String(new char[100]);
	   final String s2 = "";
	   String p;
	   String q;
	   p = s;
	   q = s2;
	   s = new Scanner(System.in).nextLine();
	   n = s.length();
	   for (i = 0;i < n - 1;i++)
	   {
		   a = (*(p.Substring(i))) + (*(p.Substring(i) + 1));
		  (*(q.Substring(i))) = a;
	   }
	   b = (*(p.Substring(n) - 1)) + (*(p.Substring(0)));
	   (*(q.Substring(n) - 1)) = b;
	   for (i = 0;i < n;i++)
	   {
		   System.out.printf("%c",*(q.Substring(i)));
	   }
	}


}
