package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[20]);
		String w = new String(new char[20]);
		int i;
		int j;
		int n;
		int m;
		int p;
		int t = 0;
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
		n = w.length();
		m = s.length();
		for (i = 0;i < n - m;i++)
		{
		   j = i;
		   p = 0;
		   while (j < i + m && w.charAt(j) == s.charAt(p++))
		   {
			   j++;
		   }
		   if (j == i + m)
		   {
			   t = 1;
			   break;
		   }
		}
		if (t = 1)
		{
			System.out.printf("%d\n",i);
		}
	}

}

