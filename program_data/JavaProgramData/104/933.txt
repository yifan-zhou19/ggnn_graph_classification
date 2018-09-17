package <missing>;

public class GlobalMembers
{
	public static int origin(int a)
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		for (i = 0;i <= 11;i++)
		{
			if (Math.pow(2,i) <= a != 0 && Math.pow(2,i + 1) - 1 >= a)
			{
				n = i + 1;
			}
		}
		j = a - Math.pow(2,n - 1) + 1;
		k = (j + 1) / 2;
		p = Math.pow(2,n - 2) + k - 1;
		return p;
	}
	public static int Main()
	{
		int[] m = new int[12];
		int[] n = new int[12];

		int n1;
		int n2;
		int i;
		int j;
		int min;
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 11;i++)
		{
			if (Math.pow(2,i) <= x != 0 && Math.pow(2,i + 1) - 1 >= x)
			{
				n1 = i + 1;
			}
		}
		for (i = 0;i <= 11;i++)
		{
			if (Math.pow(2,i) <= y != 0 && Math.pow(2,i + 1) - 1 >= y)
			{
				n2 = i + 1;
			}
		}

		if (n1 == 1 || n2 == 1)
		{
			System.out.print(1);
		}
		else
		{
		m[n1] = x;
		n[n2] = y;
		m[n1 + 1] = -1;
		n[n2 + 1] = -2;
		if (x > y)
		{
			min = x;
		}
		else
		{
			min = y;
		}
		for (i = n1 - 1;i >= 1;i--)
		{
			m[i] = origin(m[i + 1]);
		}
		for (i = n2 - 1;i >= 1;i--)
		{
			n[i] = origin(n[i + 1]);
		}
		for (j = 1;j <= min;j++)
		{
			if (m[j] == n[j] && m[j + 1] != n[j + 1])
			{
				System.out.print(m[j]);
				System.out.print("\n");
				break;
			}
		}
		}

	   return 0;
	}




}

