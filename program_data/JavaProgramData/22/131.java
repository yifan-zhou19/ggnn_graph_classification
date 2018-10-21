package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] c = new int[300];
		int i;
		int j = 0;
		int k;
		int l;
		int m;
		int n;
		final String b = "";
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) == '\n')
			{
				j = i + 1;
				break;
			}
		}

		if (j == 1)
		{
			System.out.print("No");
			System.exit(-1);
		}
		if (j > 1)
		{
			for (i = 0;i <= j - 1;i++)
			{
				c[i] = a[i] - a[0];
			}
		}
	m = 0;
	for (i = 0;i <= j - 1;i++)
	{
		if (c[i] != 0)
		{
			m = m + 1;
		}
	}
	if (m == 0)
	{
		System.out.print("No");
		System.exit(-1);
	}
		k = a[0];
		for (i = 0;i < j;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
		for (i = 0;i < j;i++)
		{
			if (a[i] == k)
			{
				a[i] = 0;
			}
		}
		l = a[0];
		for (i = 0;i < j;i++)
		{
			if (a[i] > l)
			{
				l = a[i];
			}
		}
		System.out.printf("%d",l);
	}



}

