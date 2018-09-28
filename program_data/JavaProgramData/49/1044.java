package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[520]);
	String b = new String(new char[520]);
	int p;
	int q;
	int x;
	a = new Scanner(System.in).nextLine();
	int n = a.length();
	for (int l = 1;l <= n;l++)
	{
	   for (int i = 0;i + l < n;i++)
	   {
		  x = 0;
		  p = i;
		  q = l + i;
		  for (;p < q;p++,q--)
		  {
			 if (a.charAt(p) != a.charAt(q))
			 {
				 x = 1;
			 }
		  }
		  if (x == 0)
		  {
			 for (int k = i;k <= i + l;k++)
			 {
			 System.out.printf("%c",a.charAt(k));
			 }
			 System.out.print("\n");
		  }
	   }
	}
	}

}
