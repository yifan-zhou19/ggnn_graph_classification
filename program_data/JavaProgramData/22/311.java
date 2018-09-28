package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int i = 0;
		int j;
		int k;
		int l;
		int r;
		int t;
		int s;
		int[] z = new int[300];
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				z[i] = z[i] * 10 + c - '0';
			}
			else
			{
				i++;
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (z[j] != z[0])
			{
				break;
			}
		}
		if (j == i + 1)
		{
			System.out.print("No");
		}
		else
		{
			for (k = 0;k <= i;k++)
			{
				for (l = 0;l <= i;l++)
				{
					if (z[k] < z[l])
					{
						break;
					}
				}
				if (l == i + 1)
				{
					break;
				}
			}
			int p;
			p = z[k];
			for (r = 0;r <= i;r++)
			{
				if (z[r] == p)
				{
					z[r] = 0;
				}
			}
			for (t = 0;t <= i;t++)
			{
				for (s = 0;s <= i;s++)
				{
					if (z[t] < z[s])
					{
						break;
					}
				}
				if (s == i + 1)
				{
					break;
				}
			}
			System.out.printf("%d",z[t]);
		}
	}


}
