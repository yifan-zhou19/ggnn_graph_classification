package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;i < s2.length();i++)
		{
			for (j = 0;j < s1.length();j++)
			{
				if (s1.charAt(j) != s2.charAt(i + j))
				{
					break;
				}
			}
			if (j == s1.length())
			{
				break;
			}
		}
		System.out.printf("%d\n",i);
		return 0;
	}

}

