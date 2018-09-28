package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int temp = 0;
		int t;
		int[] c = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[0] = 2;
		c[1] = -1;
		for (i = 1;i <= n - 1;i++)
		{
			int j = 0;
			temp = 0;
			while (c[j] != -1)
			{
				t = c[j] * 2 + temp;
				c[j] = t % 10;
				temp = t / 10;
				j++;
			}
			if (temp != 0)
			{
				c[j++] = temp;
			}
			c[j] = -1;
		}
		i = 0;
		while (c[i] != -1)
		{
			i++;
		}
		if (n != 0)
		{
			for (int j = i - 1;j >= 0;j--)
			{
				System.out.print(c[j]);
			}
		}
		else
		{
			System.out.print(1);
		}
		return 0;
	}
}

