package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[51][20];
		int[] b = new int[51];
		int n = 0;
		String p;
		while (scanf("%s",a[n]) != EOF)
		{
			n++;
		}
		int i;
		for (i = 0;i < n;i++)
		{
			p = a[i];
			while (p != '\0')
			{
				b[i]++;
				(p) = (p).Substring(1);
			}
		}
		int m = b[0];
		int index = 0;
		for (i = 1;i < n;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
				index = i;
			}
		}
		System.out.printf("%s\n\n",a[index]);
		m = b[0];
		index = 0;
		for (i = 1;i < n;i++)
		{
			if (b[i] < m)
			{
				m = b[i];
				index = i;
			}
		}
		System.out.printf("%s",a[index]);
		return 0;
	}
}
