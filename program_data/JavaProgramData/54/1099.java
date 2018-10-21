package <missing>;

public class GlobalMembers
{
	public static int count(int a, int b)
	{
		int n;
		int k;
		int i;
		int c;
		int d;
		n = a,k = b,c = 1;
		for (i = 0;i < n - 1;i++)
		{
			if (i == 0)
			{
				d = (c * a + k);
			}
			else
			{
				d = a;
			}
			if (d % (n - 1) != 0)
			{
				c++;
				i = -1;
				a = n;
			}
			else
			{
				a = d / (n - 1) * n + k;

			}
		}
		return a;
	}
	public static int Main()
	{
		int k;
		int n;
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
		System.out.printf("%d",count(n, k));
		return 0;
	}
}

