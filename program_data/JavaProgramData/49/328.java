package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		int i;
		int j;
		int k;
		int p;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (k = 2;k < len;k++)
		{
		for (i = 0;i <= len - k;i++)
		{
			for (j = i;j < i + k / 2;j++)
			{
			if (s.charAt(j) != s.charAt(2 * i + k - 1 - j))
			{
				break;
			}
			}
			if (j == i + k / 2)
			{
				for (p = i;p < i + k;p++)
				{
				System.out.printf("%c",s.charAt(p));
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}


}

