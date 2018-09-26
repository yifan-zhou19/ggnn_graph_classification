package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 1;
		int m = 1;
		int j = 1;
		int f1 = 1;
		int f2 = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		if (n >= 5)
		{
			f1 = 3;
			for (i = 3;i <= n;i = i + 2)
			{
				m = Math.sqrt(i);
				for (j = 2;j <= m;j++)
				{
				 if (i % j == 0)
				 {
					 break;
				 }
				}
				if (j >= m + 1)
				{
				f2 = i;
				}
				if (f2 == f1 + 2)
				{


					System.out.printf("%d %d\n",f1,f2);
					f1 = f2;
				}
				else
				{
				f1 = f2;
				}




			}



		}
	}

}

