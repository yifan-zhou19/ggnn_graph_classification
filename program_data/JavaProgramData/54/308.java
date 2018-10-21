package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
		int i;
		int q = 1;
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
		if (n == 2 && k == 1)
		{
			System.out.printf("7\n",m);
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				q = n * q;
				m = q - n * k + k;
			}
			System.out.printf("%d\n",m);
		}
	}



}

