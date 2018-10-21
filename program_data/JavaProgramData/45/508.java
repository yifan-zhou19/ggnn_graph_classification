package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int kw;
		int ks;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int q;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		ks = s.length(),kw = w.length();
		for (p = w.Substring(kw) - 1;p >= w;p--)
		{
			r = 0;
			for (j = 0;j < ks;j++)
			{
				if (w.charAt(p - w - j) != s.charAt(ks - 1 - j))
				{
					r = 1;
				}
			}
			if (r == 0)
			{
				q = p - w - ks + 1;
			}
		}
		 System.out.printf("%d",q);
	}


}

