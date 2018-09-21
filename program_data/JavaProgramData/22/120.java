package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int n;
		int b;
		int[] a = new int[300];
		char d;
		String c = new String(new char[10000]);
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (j = 0;j < c.length();j++)
		{
			d = c.charAt(j);

		if (d == ',')
		{
			a[i++] = b;
			b = 0;
		}
		else
		{
			b = b * 10 + (int)d - 48;
		}
		}
		a[i++] = b;
		n = i;
		b = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > b)
			{
				b = a[i];
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > j && a[i] < b)
			{
				j = a[i];
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",j);
		}
	}


}

