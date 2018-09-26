package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k;
		int nx;
		int f;
		int ix;
		int flag;
		int[] a = new int[100000];
		int[] s = new int[100000];
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
		flag = 0;
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					a[i] = 1;
					break;
				}
			}
		}
		for (i = m;i <= n;i++)
		{
			if (a[i] == 0)
			{
				ix = i;
				k = 0;
				while (ix > 0)
				{
					s[k] = ix % 10;
					k++;
					ix = ix / 10;
				}
				f = 0; //printf("%d\n",k);
				for (j = 0;j < k / 2 + 1;j++)
				{
					if (s[j] != s[k - j - 1])
					{
						f = 1;
						break;
					}
				}
				if (f == 0 && flag == 0)
				{
					System.out.printf("%d",i);
					flag = 1;
				}
				else if (f == 0)
				{
					System.out.printf(",%d",i);
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
		return 0;
	}



}

