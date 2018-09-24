package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[50]);
	String w = new String(new char[50]);
	String z = new String(new char[200]);
	String a = new String(new char[100]);
	int i = 0;
	int ls;
	int lw;
	int k = 0;
	int t = 1;
	int m;
	int n = 0;
	int len;
	int ci = 0;
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
	ls = s.length();
	lw = w.length();
	for (i = 0;i < lw;i++)
	{
	   if (w.charAt(i) == s.charAt(0))
	   {
		   m = i;
		for (k = 0;k < ls;k++)
		{
			if (s.charAt(k) != w.charAt(i))
			{
				t = 0;
				break;

			}
		  i++;

		}
		if (t == 1)
		{
		n = m;
		}

	   }

	}

		if (t != 0)
		{
		System.out.printf("%d",n);
		}




	return 0;
	}

}

