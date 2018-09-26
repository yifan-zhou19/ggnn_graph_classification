package <missing>;

public class GlobalMembers
{
	 public static int f(int m, int n)
	 {

		   if (m == 0 || n == 1)
		   {
	return 1;
		   }
		   if (m < n)
		   {
	return f(m, m);
		   }

		   else
		   {
	return f(m, n - 1) + f(m - n, n);
		   }

	 }



	public static int Main()
	{

		int t;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < t;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				System.out.printf("%d\n",f(a, b));

		}


		return 0;
	}

}

