package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 1;
		int n;
		int k;
		int s;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 2)
		{
			s = 4 + 3 * k;
		}
		else
		{
			do
			{
		  t = n * t;
		  m++;
			}while (m <= n);
		s = t - k * (n - 1);
		}
		System.out.printf("%d\n",s);
	}

}

