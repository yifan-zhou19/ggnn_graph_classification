package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int e = 0;
		int[] s = new int[500];
		int max;
		int[] ss = new int[500];
		String a = new String(new char[501]);
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
		l = a.length();
		for (int i = 0;i < l - n + 1;i++)
		{
				for (int j = i + 1;j < l - n + 1;j++)
				{
						for (int k = 0;k < n;k++)
						{
								if (a.charAt(i + k) == a.charAt(j + k))
								{
								e++;
								}
						}
						if (e == n)
						{
								 s[i]++;
						}
								 e = 0;
				}
		}
				max = s[0];
		for (int p = 0;p < l - n + 1;p++)
		{
				if (max < s[p])
				{
							 max = s[p];
				}
		}
			   int ee = 0;
		for (int q = 0;q < l - n + 1;q++)
		{
				if (max == s[q])
				{
							  ss[ee] = q;
							  ee++;
				}
		}
				if (max != 0)
				{
				System.out.printf("%d",max + 1);

		for (int r = 0;r < ee;r++)
		{
				System.out.print("\n");
				for (int t = 0;t < n;t++)
				{
						System.out.printf("%c",a.charAt(ss[r] + t));
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

