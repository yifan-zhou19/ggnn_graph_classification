package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String w = new String(new char[256]);
		String z = new String(new char[256]);
		int ls;
		int lw;
		int t;
		int lz;
		int i;
		int j;
		int loc = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = tempVar3.charAt(0);
		}
		ls = s.length();
		lw = w.length();
		lz = z.length();
		for (i = 0;i < lw;i++)
		{
					  t = 0;
					  for (j = 0;j < ls;j++)
					  {
										if (w.charAt(i + j) == s.charAt(j))
										{
										t++;
										}
					  }
					  if (t == ls)
					  {
					  loc = i;
					  break;
					  }
		}

		if (loc != -1)
		{
		for (i = 0;i < loc;i++)
		{
						   System.out.printf("%c",w.charAt(i));
		}


		System.out.printf("%s",z);
		for (i = loc + lz;i < lw;i++)
		{
							 System.out.printf("%c",w.charAt(i));
		}
		}
		else
		{
			 System.out.println(w);
		}




			return 0;
	}
}

