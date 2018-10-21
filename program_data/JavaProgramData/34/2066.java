package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t = 2;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;n != 1;i++)
		{
			if (n % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",n,n / 2);
				t = 0;
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
				t = 1;
			}
			if (t == 0)
			{
				n = n / 2;
			}
			if (t == 1)
			{
				n = n * 3 + 1;
			}
		}
		System.out.print("End");


		return 0;
	}




}

