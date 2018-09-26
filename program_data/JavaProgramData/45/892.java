package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String x = new String(new char[50]);
		char y;
		int len_s;
		int len_w;
		int i;
		int j;
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
		len_s = s.length();
		len_w = w.length();
		for (i = 0;i < len_w;i++)
		{
			if (w[i] = s.charAt(0) != null)
			{
				for (j = 0;j < len_s;j++)
				{
				x = tangible.StringFunctions.changeCharacter(x, j, w.charAt(i + j));
				}
				y = strcmp(x,s);
				if (y == 0)
				{
					System.out.printf("%d",i);
				break;
				}
			}
		}
	}


}

