package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int times;
		int[] a = new int[500];
		int max = 1;
		String c = new String(new char[600]);
		String temp = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		times = c.length() - n + 1;
		for (i = 0;i < times;i++)
		{
			for (j = 0;j < n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, c.charAt(j + i));
			}
			temp = temp.substring(0, j);
			a[i] = 1;
			for (j = i + 1;c.charAt(j) != 0;j++)
			{
				int b = 1;
				for (k = 0;k < n;k++)
				{
					if (temp.charAt(k) != c.charAt(j + k))
					{
						b = 0;
					}
				}
				if (b == 1)
				{
					a[i]++;
				}
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i < times;i++)
		{
			if (a[i] == max)
			{
				for (j = i;j < i + n;j++)
				{
					System.out.print(c.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

