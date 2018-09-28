package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		int k;
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
		for (i = 0;i < w.length();i++)
		{
								if (w.charAt(i) == s.charAt(0))
								{
											  for (k = 0;k < s.length();k++)
											  {
																	  if (s.charAt(k) == w.charAt(i + k))
																	  {
																	  count++;
																	  }
											  }
											  if (count == s.length())
											  {
											  System.out.printf("%d",i);
											  }
								}
		}
		return 0;
	}

}

