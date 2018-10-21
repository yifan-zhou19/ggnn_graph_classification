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
		for (j = 1;j < 101;j++)
		{
			String tempVar = ConsoleInput.scanfRead(" ");
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			k = 0;
			for (i = 2;i <= n;i++)
			{
				k = ((m % i) + k) % i;
			}
			k++;
			if (n != 0)
			{
				System.out.printf("%d\n", k);
			}
		}
		return 0;
	}
}

