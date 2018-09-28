package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0; //??k???????????????????
		for (i = 2;i <= n;i++)
		{
			flag = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
				}
			}
			if (flag != 0)
			{
				a[k] = i;
				k++;
			}
		}
		flag = 1;
		for (i = 0;i < k - 1;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("empty");
		}

	}
}

