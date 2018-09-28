package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int m1;
		int m2 = 0;
		int n = 0;
		int c;
		while (scanf("%d", a[i]))
		{
			c = System.in.read();
			if (i == 0)
			{
				m1 = a[0];
			}
			else if (a[i] > m1)
			{
				m1 = a[i];
			}
			if (c == '\n')
			{
				break;
			}
			i++;
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] < m1 && a[j]> m2)
			{
				m2 = a[j];
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] == m2)
			{
				n++;
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",m2);
		}
	}
}
