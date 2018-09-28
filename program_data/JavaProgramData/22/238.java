package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int k;
		int m;
		int t;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (j = 0;j < i - 1;j++)
		{
			m = j;
			for (k = j + 1;k < i;k++)
			{
				if (a[k] > a[m])
				{
					m = k;
				}
			}
			if (m > j)
			{
				t = a[m];
				a[m] = a[j];
				a[j] = t;
			}
		}
		j = 1;
		while (a[j] == a[0])
		{
			j++;
		}
		if (i == 1 || j == i)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[j]);
		}
	}

}

