package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int[] a = new int[N];
		int i;
		int j;
		int num;

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
			x = Integer.parseInt(tempVar3);
		}

		for (i = 0,num = 0;i < n - num;i++)
		{
			if (a[i] == x)
			{
				if (i == n - 1 - num)
				{
					num++;
				}
				else
				{
				  for (j = i;j < n - num - 1;j++)
				  {
					a[j] = a[j + 1];
				  }
				  i--;
				  num++;
				}
			}
		}

		for (i = 0;i < n - num;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}

		return 0;
	}

}

