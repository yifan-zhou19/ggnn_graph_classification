package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
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
		for (i = 1;;i++)
		{
			m = i * (n - 1);
		//	printf("i=%d\n",i);
			for (j = n;j > 0;j--)
			{
		//		printf("j=%d\n",j);
				m = m * n / (n - 1) + k;
		//		printf("m=%d\n",m);
				if (m % (n - 1) != 0)
				{
					break;
				}
			}
		//		printf("j=%d\n",j);
			if (j == 1 || j == 0)
			{
				break;
			}
		//	printf("j=%d\n",j);
			if (j > 1)
			{
				continue;
			}
		}
		System.out.printf("%d",m);
	}

}

