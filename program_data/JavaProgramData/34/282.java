package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 3;
		int b = 1;
		int c = 2;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			if (n % 2 != 0)
			{
				m = 3 * n + 1;


				System.out.printf("%d*%d+%d=%d\n",n,a,b,m);
				n = m;
			}

			if (n % 2 == 0)
			{
				p = n / 2;
			   System.out.printf("%d/%d=%d\n",n,c,p);
				n = p;
			}


		}
			if (n == 1)
			{
			System.out.print("End");
			}





	}
}

