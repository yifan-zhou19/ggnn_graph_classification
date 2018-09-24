package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[A];
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
				break;
				}
			}
			if (j == i)
			{
				a[k] = i;
			k++;
			}
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
		for (i = 0;i < k - 1;i++)
		{
			if (a[i] + 2 == a[i + 1])
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
		}


	}

}

