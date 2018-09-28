package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (i = 0;i < w.length();i++)
		{
			if (w[i] = s.charAt(0) != null)
			{
				for (j = 1;j < s.length();j++)
				{
					if (w.charAt(i + j) != s.charAt(j))
					{
						break;
					}
				}
				if (j == s.length())
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
	}
}

