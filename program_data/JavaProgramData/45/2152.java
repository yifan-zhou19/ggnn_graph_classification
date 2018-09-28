package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String worda = new String(new char[51]);
		String wordb = new String(new char[51]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			worda = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			wordb = tempVar2.charAt(0);
		}
		int i;
		int j;
		i = 0;
		while (i < wordb.length())
		{
						  j = 0;
						  while (j < worda.length())
						  {
												if (worda.charAt(j) != wordb.charAt(i))
												{
																	  break;
												}
												j++;
												i++;
						  }
						  if (j == worda.length())
						  {
											  break;
						  }
						  i++;
		}
		System.out.printf("%d", i - j);
		return 0;
	}




}

