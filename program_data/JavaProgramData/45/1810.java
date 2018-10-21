package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String sw = new String(new char[50]);
		int schangdu;
		int wchangdu;
		int i;
		int j;
		int m;
		int tag = 0;
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
		schangdu = s.length();
		wchangdu = w.length();
		for (i = 0;i < wchangdu;i++)
		{
			for (j = i;j < i + schangdu;j++)
			{
				sw = tangible.StringFunctions.changeCharacter(sw, j - i, w.charAt(j));
			}
			sw = sw.substring(0, schangdu);
				m = strcmp(s,sw);
				if (m == 0)
				{
					System.out.printf("%d",i);
					tag = 1;
					break;
				}
				if (tag == 1)
				{
					break;
				}
			if (tag == 1)
			{
				break;
			}
		}
		return 0;
	}
}

