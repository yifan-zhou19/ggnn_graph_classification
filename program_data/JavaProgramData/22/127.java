package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int len;
		int n;
		int m;
		int k;
		int b;
		int max;
		int[] l = new int[300];
		String c = new String(new char[1505]);
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (n = 1,i = 0;i < len;i++)
		{
			if (c.charAt(i) == ',')
			{
				n++;
			}
		}
		b = 0;
		for (i = 0;i < n;i++)
		{
			l[i] = 0;
			for (j = 0;j < 4;j++)
			{
				if (c.charAt(b + j) != ',' && c.charAt(b + j) != 0)
				{
					l[i]++;
				}
				else
				{
					break;
				}
			}
			for (m = 1,k = l[i] + b - 1;k >= b;k--)
			{
				a[i] += (c.charAt(k) - 48) * m;
				m = m * 10;
			}
			b += l[i] + 1;
		}
		for (max = 0,i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
				a[i] = -2;
			}
		}
		for (i = 0,max = -1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max != -1)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.print("No");
		}
	}
}
