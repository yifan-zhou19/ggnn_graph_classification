package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int timer;
		int k;
		int k0;
		timer = 0;
		k0 = 0;
		k = -1;
		int[] l = new int[100000];
		int[] r = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				l[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (l[i] == l[j])
				{
					l[j] = 10000;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (l[i] == 10000)
			{
				timer++;
			}
		}
	//	printf("n-t=%d",n-timer);
		for (i = 0;i < n;i++)
		{
			if (l[i] != 10000)
			{
	//			printf("%d\n",l[i]);
				k0++;
				k++;
				r[k] = l[i];
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < k0;i++)
		{
			if (k == 0)
			{
				System.out.printf("%d",r[i]);
			}
			else if (k != 0 && i < k0 - 1)
			{
				System.out.printf("%d ",r[i]);
			}
			else if (i == k0 - 1)
			{
				System.out.printf("%d",r[i]);
			}
		}
		return 0;
	}

}

