package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int c = 0;
		int[] a = new int[100000];
		int k;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - c;)
		{
			if (a[i] == k)
			{
				c++;
				for (j = i + 1;j < n;j++)
				{
					a[j - 1] = a[j];
				}
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < n - c;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n - c - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

