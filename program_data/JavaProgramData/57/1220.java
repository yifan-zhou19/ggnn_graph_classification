package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  l = s.length();
			  if (s.charAt(l - 1) == 'r')
			  {
				  s = s.substring(0, l - 2);
			  }
			  if (s.charAt(l - 1) == 'g')
			  {
				  s = s.substring(0, l - 3);
			  }
			  if (s.charAt(l - 1) == 'y')
			  {
				  s = s.substring(0, l - 2);
			  }
			  System.out.println(s);

		}
		  return 0;
	}


}

