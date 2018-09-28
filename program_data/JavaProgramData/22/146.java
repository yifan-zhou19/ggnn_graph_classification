package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int p = 0;
		int max;
		int[] a = new int[100];
		char x;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			x = System.in.read();
				k = i;
			if (x != ',')
			{
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		if (k != 0)
		{
			for (i = 1;i <= k;i++)
			{
				if (a[0] == a[i])
				{
					p++;
				}
				else
				{
					break;
				}
			}
			if (p == k)
			{
				System.out.print("No\n");
			}
			else
			{
				max = a[0];
				for (i = 0;i <= k;i++)
				{
				if (max < a[i])
				{
					max = a[i];
				}
				}
			for (i = 0;i <= k;i++)
			{
				if (a[i] == max)
				{
					a[i] = 0;
				}
			}
			max = a[0];
			for (i = 0;i <= k;i++)
			{
				if (max < a[i])
				{
					max = a[i];
				}
			}
			System.out.printf("%d\n",max);
			}

		}
	}
}

