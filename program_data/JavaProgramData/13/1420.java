package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sign;
		int counter;
		int[] a = new int[20000];
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
		counter = 0;
		for (i = 0;i < n && counter == 0;i++)
		{
			sign = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					sign = sign + 1;
				}
			}
			if (sign == 0)
			{
				System.out.printf("%d", a[i]);
				counter = counter + 1;
			}
		}
		for (;i < n;i++)
		{
			sign = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					sign = sign + 1;
				}
			}
			if (sign == 0)
			{
				System.out.printf(" %d", a[i]);
			}
		}

		return 0;
	}
}

