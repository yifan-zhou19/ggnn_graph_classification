package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int x = 0;
		int y = 0;
		int l = 0;
		int[] sushu = new int[100000];
		int[] a = new int[10];
		int aaa;
		int bbb;
		for (i = 0;i < 100000;i++)
		{
			sushu[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i / 2 + 1)
			{
				sushu[i] = 1;
			j = 0;
			x = i;
			l = 0;
			for (k = 0;k < 10;k++)
			{
				a[k] = 0;
			}
			while (x != 0)
			{
				a[l++] = x % 10;
				x = x / 10;
			}
			for (k = 0;k < l;k++)
			{
				if (a[k] != a[l - k - 1])
				{
					break;
				}
			}
			if (k < l && sushu[i] == 1)
			{
				sushu[i] = 0;
			}
			}
		}


		for (i = m;i <= n;i++)
		{
			if (sushu[i] == 1)
			{
				break;
			}
		}
		if (i == n + 1)
		{
			System.out.print("no\n");
		}
		else
		{
			/*for(i=m;i<=n;i++)
			{
				if(sushu[i]==1) 
				{
					printf("%d",i);
				    break;
				}
			}
			y=i;*/
			//i=m;
			//while (sushu[i]==0) i++;
			System.out.printf("%d",i++);
			for (;i <= n;i++)
			{
				if (sushu[i] == 1)
				{
					System.out.printf(",%d",i);
				}
			}

		System.out.print("\n");
		}
	}

}

