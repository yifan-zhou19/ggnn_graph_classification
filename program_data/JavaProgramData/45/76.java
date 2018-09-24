package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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

		int c;
		int d;
		c = s.length();
		d = w.length();
		int i;
		for (i = 0;i < c;i++)
		{
			if (s.charAt(0) == w.charAt(i) && s.charAt(1) == w.charAt(i + 1))
			{
			break;
			}
		}
		System.out.printf("%d",i);



	}

}

