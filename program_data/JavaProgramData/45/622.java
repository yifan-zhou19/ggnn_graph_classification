package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int i;
		int j;
		int p = 1;
		int len;
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
		len = s.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			for (j = 0;j < len;j++)
			{
				if (w.charAt(i + j) != s.charAt(j))
				{
				p = 0;
				break;
				}
			}
			if (p == 1)
			{
				System.out.printf("%d",i);
				break;
			};
			p = 1;
		}
	}

}

