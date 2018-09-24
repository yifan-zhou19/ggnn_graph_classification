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
		int t;
		int p;
		n = a.length();
		for (i = 2;i <= n;i++)
		{

			for (j = 0;j <= n - i;j++)
			{
					 for (t = j;t < j + i / 2;t++)
					 {
			  if (a.charAt(t) != a.charAt(2 * j + i - 1 - t))
			  {
				 break;
			  }
					 }
			   if (t == j + i / 2)
			   {
				 for (p = j;p < j + i;p++)
				 {
					 System.out.printf("%c",a.charAt(p));
				 }
				  System.out.print("\n");
			   }
			}

		}
	}
}
