package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		char j;
		int l;
		int i;
		int[] s = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		l = zfc.length();
		for (i = 0;i < l;i++)
		{
			for (j = 97;(int)j <= 122;(int)j++)
			{
				if (zfc.charAt(i) == (char)j)
				{
					s[(int)j - 97]++;
				}
			}
		}
		int a = 0;
		for (i = 0;i < 26;i++)
		{
			if (s[i] != 0)
			{
				System.out.printf("%c=%d\n",(char)(i + 97),s[i]);
				a = 1;
			}
		}
		if (a == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

