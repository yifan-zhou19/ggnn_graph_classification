package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int m;
		int max;
		int n = 0;
		int s = 0;
		char b;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b = System.in.read();
			if (b == '\n')
			{
				m = i;
				break;
			}

		}
		if (m == 1)
		{
			System.out.print("No");
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] == a[i + 1])
			{
				n++;
			}
		}
			if (n == m)
			{
				System.out.print("No");
			}
			else
			{
		max = a[0];
		for (i = 0;i <= m;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < m + 1;i++)
		{
			if (s < a[i] && a[i] < max)
			{
				s = a[i];
			}
		}
		for (i = 1;i <= m;i++)
		{
			if (s < a[i] && a[i] < max)
			{
				s = a[i];
			}
		}
			System.out.printf("%d",s);
			}
	}
}

