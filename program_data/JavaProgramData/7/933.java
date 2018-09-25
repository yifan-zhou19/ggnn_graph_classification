package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String z = new String(new char[256]);
		String p = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = tempVar3.charAt(0);
		}
		int i;
		int ls;
		int lz;
		int lp;
		int j;
		int t = 0;
		int loc = -1;
		ls = s.length();
		lz = z.length();
		lp = p.length();
		for (i = 0;i < ls;i++)
		{
						  t = 0;
						  for (j = i;j < i + lz;j++)
						  {
											if (s.charAt(j) == z.charAt(j - i))
											{

															t++;
											}
						  }

											if (t == lz)
											{

													 loc = i;
													 i = ls;
													 j = lz;
											}

		}

		if (loc == -1)
		{
					System.out.println(s);
		}

		else
		{
			 for (i = 0;i < loc;i++)
			 {
								System.out.printf("%c",s.charAt(i));
			 }
			 for (i = 0;i < lp;i++)
			 {
							   System.out.printf("%c",p.charAt(i));
			 }
			 for (i = loc + lp;i < ls;i++)
			 {
									System.out.printf("%c",s.charAt(i));
			 }
		}
			return 0;
	}
}

