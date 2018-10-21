package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	double cd2;
	double cd1;
	double per;
	double szp;
	double s = 0;
	String zf = new String(new char[501]);
	String zf2 = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		per = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zf = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		zf2 = tempVar3.charAt(0);
	}
	cd1 = zf.length();
	cd2 = zf2.length();
	if (cd1 == cd2)
	{
		for (i = 0;i < cd1;i++)
		{
			if (zf.charAt(i) == 'A' || zf.charAt(i) == 'T' || zf.charAt(i) == 'C' || zf.charAt(i) == 'G' && zf2.charAt(i) == 'A' || zf2.charAt(i) == 'T' || zf2.charAt(i) == 'C' || zf2.charAt(i) == 'G')
			{
				if (zf.charAt(i) == zf2.charAt(i))
				{
					s = s + 1;
				}
			}
			else
			{
				System.out.print("error");
				   break;
			}
				if (i == cd1 - 1)
				{
					szp = s / cd1;
					if (szp > per)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
				}
		}
	}

	else
	{
		System.out.print("error");
	}

			return 0;
	}

}

