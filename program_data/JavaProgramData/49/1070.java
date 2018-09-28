package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[500]);
	 a = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int n;
	 int k;
	 int t;
	 int m;
	 n = a.length();
	 for (i = 1;i < n;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   t = j + i;
	   m = 0;
	   if (t > n - 1)
	   {
		   break;
	   }
	   t = (t + j) / 2;
	   for (k = j;k <= t;k++)
	   {
		if (a.charAt(k) != a.charAt(2 * j + i - k))
		{
			m = 1;
			break;
		}
	   }
	   if (m == 0)
	   {
		   for (k = j;k <= j + i;k++)
		   {
		System.out.printf("%c",a.charAt(k));
		   }
	   System.out.print("\n");
	   }
	  }
	 }
	}


}
