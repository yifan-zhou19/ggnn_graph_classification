package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int ans = 0;
		char d = '-';
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < 6;i++)
		{
			ans = 0;
			if (a[i] == 0)
			{
				System.out.printf("%d\n",0);
			}
			if (a[i] < 0)
			{
				a[i] = a[i] * (-1);
				System.out.printf("%c",d);
			   while (a[i] != 0)
			   {
				 ans *= 10;
				  ans = a[i] % 10 + ans;
				  a[i] /= 10;
			   }
				System.out.printf("%d\n",ans);
			}
			if (a[i] > 0)
			{
				while (a[i] != 0)
				{
					ans *= 10;
				  ans = a[i] % 10 + ans;
				  a[i] /= 10;
				}
			  System.out.printf("%d\n",ans);
			}

		}
	}
}

