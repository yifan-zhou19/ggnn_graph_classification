package <missing>;

public class GlobalMembers
{
	public static int fun(int[] a, int l)
	{
		int i;
		int j = 0;
		for (i = 0;i < l;i++)
		{
			if (a[i] != a[l - i - 1])
			{
				j = 1;
				return 0;
			}
		}
		if (j == 0)
		{
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c",a[i]);
			}
			System.out.print("\n");
			return 0;
		}


	}

	public static int Main()
	{
		String s = new String(new char[500]);
		int[] s1 = new int[500];
		int i;
		int l;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 2;i <= l;i++)
		{
			for (j = 0;j < l - i + 1;j++)
			{
				for (k = 0;k < i;k++)
				{
					s1[k] = s.charAt(k + j);
				}
				fun(s1, i);
			}

		}

	}


}

