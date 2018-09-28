package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		int i;
		int j = 0;
		for (i = 0;i < w.length();i++)
		{
			for (;j < s.length();)
			{
				if (s.charAt(j) == w.charAt(i))
				{
					j++;
				}
					break;


			}
			if (j == s.length())
			{
				System.out.printf("%d",i - j + 1);
				break;
			}
		}

		return 0;
	}


}

