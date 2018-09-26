package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String h = new String(new char[21]);
		for (x = 0;x < y;x++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h = tempVar2.charAt(0);
		}
			 d = 0;
	  if ((h.charAt(0) >= 'a' && h.charAt(0) <= 'z') || (h.charAt(0) >= 'A' && h.charAt(0) <= 'Z') || (h.charAt(0) == '_'))
	  {
				 d++;
	  }
		for (i = 1;i < h.length();i++)
		{
			if ((h.charAt(i) >= 'a' && h.charAt(i) <= 'z') || (h.charAt(i) >= 'A' && h.charAt(i) <= 'Z') || (h.charAt(i) == '_') || (h.charAt(i) >= '0' && h.charAt(i) <= '9'))
			{
				d++;
			}
		}
		if (d == h.length())
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		}
		return 0;
	}


}

