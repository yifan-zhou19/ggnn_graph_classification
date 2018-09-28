package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int len;
		int e = 0;
		char[][] word = new char[NMAX][AMAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		i = 0;
		while (i < n)
		{
			len = String.valueOf(word[i]).length();
			for (;len <= 80 && i < n;i++)
			{
				len += String.valueOf(word[i + 1]).length() + 1;
			}
			System.out.printf("%s",word[e]);
			for (j = e+1;j < i;j++)
			{
				System.out.printf(" %s",word[j]);
			}
			e = i;
			System.out.print("\n");

		}

	}


}

