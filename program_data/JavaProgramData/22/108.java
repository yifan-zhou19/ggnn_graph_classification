package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int max;
		String c = new String(new char[10]);
		for (n = 0;;n++)
		{
			for (i = 0;;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
				if (c.charAt(i) == ',' || c.charAt(i) == 10)
				{
					break;
				}
			}
			a[n] = 0;
			for (j = 0;j < i;j++)
			{
				a[n] = 10 * a[n] + c.charAt(j) - '0';
			}
			if (c.charAt(i) == 10)
			{
				break;
			}
		}
		max = -1;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] == max)
			{
				a[i] = -1;
			}
		}
		max = -1;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d",max);
		}
	}
}

