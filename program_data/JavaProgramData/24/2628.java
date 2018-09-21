package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int l)
	{
		int i;
		int j;
		int t;
		for (i = 1;i < l;i++)
		{
			for (j = 0;j < l - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = (a + j + 1);
					a[j + 1] = t;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int min = 50;
		int max = 0;
		int maxt;
		int mint;
		int[] l = new int[503];
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
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
				c + i = tempVar2;
			}
			l[i] = String.valueOf(c + i).length();
		}

		for (i = 0;i < n;i++)
		{
			if (l[i] > max)
			{
				max = (l + i);
				maxt = i;
			}
			if (l[i] < min)
			{
				min = (l + i);
				mint = i;
			}
		}
		if (min == max)
		{
			System.out.printf("%s\n%s",c,c);
		}
		else
		{
			System.out.printf("%s\n%s",*(c + maxt),*(c + mint));
		}

	}
}

