package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		int j;
		int k;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		for (i;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				n--;
				i--;
				s++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n - 1)
			{
			System.out.print(" ");
			}
		}

		return 0;
	}


}

