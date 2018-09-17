package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char c;
		int l;
		int[] b = new int[26];
		int z;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();

		for (c = 'a';c <= 'z';c++)
		{
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == c)
				{
					b[c - 'a']++;
				}
			}
		}
		 z = 0;
		for (t = 0;t < 26;t++)
		{
			if (b[t] != 0)
			{
				z = 1;
			}
		}


			if (z == 1)
			{
				for (t = 0;t < 26;t++)
				{
				if (b[t] != 0)
				{
					System.out.printf("%c=%d\n",'a' + t,b[t]);
				}
				}
			}
			else
			{
				System.out.print("No\n");
			}
	}
}

