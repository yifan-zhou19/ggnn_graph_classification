package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		char c;
		int[] t = new int[26];
		int n;
		int i;
		int j;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		c = 'a';
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a.charAt(i) == (char)(c + j))
				{
					t[j] += 1;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (t[i] != 0)
			{
				System.out.printf("%c=%d\n",(char)(c + i),t[i]);
			}
			else
			{
				b++;
			}
		}
		if (b == 26)
		{
			System.out.print("No");
		}
		return 0;
	}

}

