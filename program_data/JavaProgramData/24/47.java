package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int max = 0;
		int min = 40;
		int[] a = new int[50];
		int p;
		int q;
		char[][] s = new char[50][40];
		String str = s;
		int[] n = a;
		while (!feof(stdin))
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				*(str + (i++)) = tempVar;
			}
		}
		j = i - 2;
		for (;j >= 0;j--)
		{
			n[j] = String.valueOf(s[j]).length();
		}
		for (j = 0;j <= i - 2;++j)
		{
			if (max < n[j])
			{
				max = (n + j);
				p = j;
			}
			if (min > n[j])
			{
				min = (n + j);
				q = j;
			}
		}
		System.out.printf("%s\n",*(str.Substring(p)));
		System.out.printf("%s",*(str.Substring(q)));
	}
}

