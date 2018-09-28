package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b = 0;
		int i = 0;
		int t = 0;
		int j = 0;
		for (a = 2;a <= n - 2;a++)
		{
						   t = 0,j = 0;
						   for (i = 3;i < a / 2 + 1;i++)
						   {
						   if (a % i == 0)
						   {
						   t++;
						   }
						   }
						   for (i = 2;i < (a + 2) / 2 + 1;i++)
						   {
						   if ((a + 2) % i == 0)
						   {
						   j++;
						   }
						   }
						   if (t == 0 && j == 0)
						   {
						   System.out.printf("%d %d\n",a,a + 2),b++;
						   }
		}
		if (b == 0)
		{
		System.out.print("empty");
		}
	}
}

