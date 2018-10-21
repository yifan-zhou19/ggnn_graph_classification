package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
		System.out.print("End\n");
		}
		else
		{
			for (i = n;i != 1;)
			{
				if (i % 2 == 0)
				{
					j = i / 2;
					System.out.printf("%d/2=%d\n",i,j);
					i = j;
				}
				else
				{
					j = i * 3 + 1;
					System.out.printf("%d*3+1=%d\n",i,j);
					i = j;
				}
			}
			System.out.print("End\n");
		}
	}



}

