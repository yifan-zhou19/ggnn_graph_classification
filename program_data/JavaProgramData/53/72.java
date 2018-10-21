package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		i = 0;


		while (i < n - 1)
		{
			k = 0;

			for (j = 0;j <= i;j++)
			{
				if (a[i + 1] != a[j])
				{
					k++;
				}
			}
			if (k == (1 + i))
			{
				System.out.printf(",%d",a[i + 1]);
			}
			i++;
		}
	}




}

