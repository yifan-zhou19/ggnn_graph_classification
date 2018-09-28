package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String k = new String(new char[50]);
		int i;
		int j;
		int t;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n1,n2;
		int n1;
		int n2;
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
		n1 = s.length();
		n2 = w.length();

		for (i = 0;i <= n2 - n1;i++)
		{
			t = 1;
			if (w.charAt(i) == s.charAt(0))
			{
			for (j = 0;j < n1;j++)
			{
			if (s.charAt(j) == w.charAt(i + j))
			{
					  t = t * 1;
			}
				   if (s.charAt(j) != w.charAt(i + j))
				   {
					  t = t * 0;
				   }
			}
		if (t == 1)
		{
				System.out.printf("%d\n",i);
			  break;
		}
			}

		}
		return 0;
	}


}

