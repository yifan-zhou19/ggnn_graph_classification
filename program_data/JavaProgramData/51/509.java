package <missing>;

public class GlobalMembers
{
	public static int mark = 1;
	public static int n;
	public static int[] b = new int[1000];
	public static int[] c = new int[1000];
	public static int max = 0;
	public static String a = new String(new char[1000]);
	public static int work(int i, int j)
	{
		int k = 0;
		while (a.charAt(i + k) == a.charAt(j + k))
		{
		  if (k < n - 1)
		  {
			  k++;
		  }
		  else
		  {
			  return 1;
		  }
		}
		return 0;

	}
	public static int Main()
	{
		int i;
		int j;
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
		for (i = 0; i <= a.length() - n; i++)
		{
			mark = 1;
			for (j = i + 1; j <= a.length() - n; j++)
			{
				if (work(i, j) == 1 && b[j] != 1)
				{
					mark += 1;

					b[j] = 1;
				}

			}
				if (mark > max)
				{
						max = mark;
				}


		}
		if (max > 1)
		{
		System.out.printf("%d\n", max);
		}

			for (i = 0; i <= a.length() - n; i++)
			{
			mark = 1;
			for (j = i + 1; j <= a.length() - n; j++)
			{
				if (work(i, j) == 1 && c[j] != 1)
				{
					mark += 1;
					c[j] = 1;
				}

			}
				if (mark == max)
				{
					if (mark > 1)
					{
					for (int k = 0; k < n; k++)
					{
					System.out.printf("%c", a.charAt(i + k));
					}
					System.out.print("\n");
					}

				}

			}
			if (max == 1)
			{
					System.out.print("NO");
			}
			return 0;
	}

}

