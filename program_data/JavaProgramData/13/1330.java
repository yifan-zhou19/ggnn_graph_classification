package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int s = 0;
		int num = 0;
		int k = 0;
		int[] a = new int[20006];
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					for (k = j;k < n;k++)
					{
						a[k] = a[k + 1];
					}
					n--;
					j--;
					s++;
				}
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

