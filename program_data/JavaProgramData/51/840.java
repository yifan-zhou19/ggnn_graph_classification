package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[500];
		int max = 0;
		final String str = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		for (i = 0; * (str.Substring(i) + n - 1) != '\0';i++)
		{
			if (a[i] == 0)
			{
				a[i] += 1;
				for (j = i + 1; * (str.Substring(j) + n - 1) != '\0';j++)
				{
					t = 1;
					for (k = 0;k < n;k++)
					{
						if (*(str.Substring(j) + k) != *(str.Substring(i) + k))
						{
							t = 0;
							break;
						}
					}
					if (t != 0)
					{
						a[i] += 1;
						a[j] = 1;
					}
				}
			}
		}
		for (i = 0; * (str.Substring(i) + n - 1) != '\0';i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0; * (str.Substring(i) + n - 1) != '\0';i++)
		{
			if (a[i] == max)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",*(str.Substring(i) + j));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

