package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
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
		int lens;
		int j;
		int i;
		int t;
		lens = s.length();
		for (j = 0;s.charAt(0) != w.charAt(j) && j < lens;j++)
		{
			;
		}
		for (i = 0, t = j;s.charAt(i) == w.charAt(t) && i < lens && t < 50;i++, t++)
		{
			;
		}
		if (i == lens)
		{
			System.out.printf("%d\n",j);
		}
	}

}

