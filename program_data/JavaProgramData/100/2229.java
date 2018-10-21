package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int cout;
		cout = 0;
		String a = new String(new char[400]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		int[] b = new int[26];
		int[] c = new int[26];

		int i;
		int j;
		int k;
		for (i = 0;i < l;i++)
		{
			if (64 < a.charAt(i) && a.charAt(i) < 91)
			{
				for (j = 0;j < 26;j++)
				{
					if (a.charAt(i) == j + 65)
					{
					b[j] = b[j] + 1;
					}
					cout++;
				}
			}
			if (96 < a.charAt(i) && a.charAt(i) < 123)
			{
				for (k = 0;k < 26;k++)
				{
					if (a.charAt(i) == k + 97)
					{
					c[k] = c[k] + 1;
					}
					cout++;
				}
			}
		}
		if (cout == 0)
		{
			System.out.print("No\n");
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 65,b[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] != 0)
			{
			System.out.printf("%c=%d\n",i + 97,c[i]);
			}
		}

		return 0;
	}

}

