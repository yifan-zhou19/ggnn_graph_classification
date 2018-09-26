package <missing>;

public class GlobalMembers
{
	public static int Main()
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
		for (i = 0;i <= w.length() - s.length();i++)
		{
										  for (j = 0;j < s.length();j++)
										  {
																  if (s.charAt(j) != w.charAt(j + i))
																  {
																  break;
																  }
										  }
										if (j == s.length())
										{
																System.out.printf("%d",i);
																return 0;
										}

		}
		return 0;
	}
}

