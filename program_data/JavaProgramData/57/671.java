package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n;
		String s = new String(new char[200]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
		   final String st = "";

		   s = new Scanner(System.in).nextLine();
		   l = s.length();
		   if ((s.charAt(l - 1) == 'r') && (s.charAt(l - 2) == 'e'))
		   {
			 st = s.substring(0, l - 2);
		   }
		   else if ((s.charAt(l - 1) == 'y') && (s.charAt(l - 2) == 'l'))
		   {
			 st = s.substring(0, l - 2);
		   }
		   else if ((s.charAt(l - 1) == 'g') && (s.charAt(l - 2) == 'n') && (s.charAt(l - 3) == 'i'))
		   {
				st = s.substring(0, l - 3);
		   }
		   System.out.println(st);
		}

		return 0;
	}
}

