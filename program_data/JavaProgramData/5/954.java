package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int yiyang = 0;
		int zongliang = 0;
		int x;
		String lian1 = new String(new char[501]);
		String lian2 = new String(new char[501]);
		double biaozhun;
		double jieguo;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			biaozhun = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lian1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			lian2 = tempVar3.charAt(0);
		}
		for (i = 0;lian1.charAt(i) != '\0' && lian2.charAt(i) != '\0';i++)
		{
			if ((lian1.charAt(i) == 'A' || lian1.charAt(i) == 'C' || lian1.charAt(i) == 'T' || lian1.charAt(i) == 'G') && (lian2.charAt(i) == 'A' || lian2.charAt(i) == 'C' || lian2.charAt(i) == 'T' || lian2.charAt(i) == 'G'))
			{
				if (lian1.charAt(i) == lian2.charAt(i))
				{
					yiyang++;
				}
				zongliang++;
			}
			else
			{
				System.out.print("error");
				x = 99;
				break;
			}
		}
		if (lian1.charAt(zongliang) != '\0' || lian2.charAt(zongliang) != '\0')
		{
			if (x != 99)
			{
			System.out.print("error");
			}
			zongliang = 0;
		}
		if (zongliang != 0)
		{
		jieguo = 1.0 * yiyang / zongliang;
		if (jieguo > biaozhun)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		return 0;
	}
}

