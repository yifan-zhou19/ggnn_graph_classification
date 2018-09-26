package <missing>;

public class GlobalMembers
{
	public static void paixu(String s)
	{
		int i;
		int j;
		int t;
		int n;
		n = s.length();
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (s[j].compareTo(s[j + 1]) < 0)
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int la;
		int lb;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
			paixu(a);
		   paixu(b);
		   k = strcmp(a,b);
		   if (k == 0)
		   {
		   System.out.print("YES");
		   }
		   else
		   {
			   System.out.print("NO");
		   }

	}
}

