package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			e = n;
			for (i = 0;i < 10000;i++)
			{
				if (e % 2 != 0 && e != 1)
				{
					f = e;
					e = e * 3 + 1;
					System.out.printf("%d*3+1=%d\n",f,e);
				}
				else
				{
					f = e;
					e = e / 2;
					System.out.printf("%d/2=%d\n",f,e);
				}
				if (e == 1)
				{
					System.out.print("End");
					break;
				}
			}
		}
	return 0;
	}

}

