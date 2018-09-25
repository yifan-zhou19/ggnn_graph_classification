package <missing>;

public class GlobalMembers
{
	public static int work(int m,int n)
	{
		while (m != n)
		{
			   if (m > n)
			   {
				   m /= 2;
			   }
			if (m < n)
			{
				n /= 2;
			}
		}
			System.out.printf("%d",m);

	}
	public static int Main()
	{
		int a;
		int b;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		work(a, b);

	}

}

