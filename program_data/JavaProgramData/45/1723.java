package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		String s = new String(new char[1000]);
		String w = new String(new char[1000]);
		int i;
		int j;
		int b;
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
		b = s.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = 0;s.charAt(j) != '\0';j++)
				{
					if (s.charAt(j) == w.charAt(i + j))
					{
						a++;
					}
				}
				if (a == b)
				{
					System.out.printf("%d",i);
				}
			}
		}
		return 0;
	}


}

