package <missing>;

public class GlobalMembers
{
	 public static int f(int n)

	 {
		 int m = 0;
	while (n != 0)
	{
		   m = m * 10 + n % 10;
		   n = n / 10;
	}
	return m;
	 }



	public static int Main()
	{
	   int a;
		for (int i = 0;i < 6;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a = Integer.parseInt(tempVar);
				}
				System.out.printf("%d\n",f(a));
		}



		return 0;
	}

}

