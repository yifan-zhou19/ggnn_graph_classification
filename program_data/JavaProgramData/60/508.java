package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int m = 0;
		int k;
		int c = 0;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			flag = 1;
		for (k = 2;k <= i / 2 && flag == 1;k++)
		{
			if (i % k == 0)
			{
				flag = 0;
			}
		}
			if (flag == 1)
			{
				a[m] = i;
		//		printf("%d",a[m]);
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = i;j < m;j++)
			{
			if (a[j] == a[i] + 2)
			{
			System.out.printf("%d %d\n",a[i],a[j]);
			c++;
			}
			}
		}

			if (c == 0)
			{
				System.out.print("empty\n");
			}
	}








}

