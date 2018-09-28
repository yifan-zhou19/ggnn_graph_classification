package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int j = -1;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else if (i % 10 == 7)
			{
				continue;
			}
			else if (i / 10 % 10 == 7)
			{
				continue;
			}
			else
			{
				j++;
				a[j] = i;
			}
		}
		for (i = 0;i <= j;i++)
		{
			s = s + a[i] * a[i];
		}
		System.out.printf("%d\n",s);
	}

}

