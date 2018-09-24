package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String c = "";
		int[] a = new int[26];
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (c.charAt(i) == 97 + j)
				{
					a[j] = a[j] + 1;
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (a[j] == 0)
			{
				continue;
			}
			System.out.printf("%c=%d\n",97 + j,a[j]);
			k = k + 1;
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}

}

