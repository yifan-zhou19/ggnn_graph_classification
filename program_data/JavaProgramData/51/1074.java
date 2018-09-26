package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[500]);
		int len;
		int n;
		int i;
		int j;
		int k;
		int l = 0;
		int m;
		int[] cd = new int[500];
		int ld;
		int max = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		len = c.length();

		for (i = 0; i < 500; i++)
		{
			cd[i] = 1;
		}
		for (i = 0; i < len - n; i++)
		{
			for (j = i + 1; j < len - n + 1; j++)
			{
				ld = 0;
				for (k = 0; k < n; k++)
				{
					if (c.charAt(i + k) == c.charAt(j + k))
					{
						continue;
					}
					else
					{
						ld++;
						break;
					}
				}
				if (ld == 0)
				{
					cd[i]++;
				}
			}
		}
		for (i = 0; i < 500; i++)
		{
			if (max < cd[i])
			{
				max = cd[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n", max);
			for (i = 0; i < 500; i++)
			{
				if (cd[i] == max)
				{
					for (j = i; j < i + n; j++)
					{
						System.out.printf("%c", c.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}





		return 0;
	}
}

