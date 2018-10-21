package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		String s = new String(new char[100]);
		String w = new String(new char[100]);
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
		n = s.length();
		m = w.length();
		for (i = 0;i < m;)
		{
			k = i;
			for (j = 0;j < n;j++,i++)
			{
				if (s.charAt(j) != w.charAt(i))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
				System.out.printf("%d",k);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	k = k + 1;
	i = i + 1;

		}
	}

}

