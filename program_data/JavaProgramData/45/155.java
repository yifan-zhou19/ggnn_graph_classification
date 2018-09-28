package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
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
		int j;
		int p;
		i = s.length();
		j = w.length();
		if (i == 1)
		{
			for (p = 0;p <= j - i + 1;p++) //w//
			{
							 if (w.charAt(p) == s.charAt(0))
							 {
							 System.out.printf("%d",p);
							 }
			}
		}
		else
		{
			 for (p = 0;p <= j - i + 1;p++)
			 {
			 if (w.charAt(p) == s.charAt(0) && w.charAt(p + i - 1) == s.charAt(i - 1))
			 {
							 System.out.printf("%d",p);

							 System.exit(0);
			 }
			 }
		}

		return 0;

	}

}

