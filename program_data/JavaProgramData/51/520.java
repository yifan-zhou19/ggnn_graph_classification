package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int b = 0;
		int[] c = new int[500];
		String a = new String(new char[500]);
		for (i = 0;i < 500;i++)
		{
			c[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int len = a.length();
		for (k = 0;k < len - n + 1;k++)
		{
			for (i = k + 1;i < len - n + 1;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(k + j) == a.charAt(i + j))
					{
						b++;
					}
				}
				if (b == n)
				{
					c[k]++;
				}
				b = 0;
			}

		}
		int max = 1;
		for (i = 0;i < len;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < len - n + 1;i++)
			{
				if (c[i] == max)
				{
					for (j = i;j < i + n;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

