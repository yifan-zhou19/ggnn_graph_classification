package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String subs = new String(new char[15]);
		String reps = new String(new char[15]);
		int i;
		int j;
		int k;
		int ls;
		int lsub;
		int lrep;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			subs = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			reps = tempVar3.charAt(0);
		}
		ls = s.length();
		lsub = subs.length();
		lrep = reps.length();
		for (i = 0;i < ls;i++)
		{
			w = 0;
			for (j = 0;j < lsub;j++)
			{
				if (s.charAt(i + j) == subs.charAt(j))
				{
					w++;
				}
			}
			if (w == lsub)
			{
				for (k = 0;k < i;k++)
				{
					System.out.printf("%c",s.charAt(k));
				}
				for (k = 0;k < lrep;k++)
				{
					System.out.printf("%c",reps.charAt(k));
				}
				for (k = i + lsub;k < ls;k++)
				{
					System.out.printf("%c",s.charAt(k));
				}
				break;
			}
		}
		if (w != lsub)
		{
			System.out.printf("%s\n",s);
		}
		return 0;
	}


}

