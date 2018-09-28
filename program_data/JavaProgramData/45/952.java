package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[50];

	public static void func(tangible.RefObject<String> pat)
	{
		int len = pat.argValue.length();
		f[0] = -1;
		for (int i = 1; i < len; i++)
		{
			int j = f[i - 1];
			while (j >= 0 && pat.argValue.charAt(i) != pat.argValue.charAt(j + 1))
			{
				j = f[j];
			}
			if (j == -1)
			{
				f[i] = -1;
			}
			else
			{
				f[i] = j + 1;
			}
		}
	}

	public static int Main()
	{
		String str = new String(new char[51]);
		String pat = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pat = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_pat = new tangible.RefObject<String>(pat);
		func(tempRef_pat);
		pat = tempRef_pat.argValue;
		int str_len = str.length();
		int pat_len = pat.length();
		int i = 0;
		int j = 0;
		while (i < str_len && j < pat_len)
		{
			if (str.charAt(i) == pat.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				if (j == 0)
				{
					i++;
				}
				else
				{
					j = f[j - 1] + 1;
				}
			}
		}
		if (j == pat_len)
		{
			System.out.printf("%d", i - pat_len);
		}
	}
}

