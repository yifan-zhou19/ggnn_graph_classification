package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double k;
	int total1;
	int total2;
	int i;
	int same = 0;
	String h1 = new String(new char[10000]);
	String h2 = new String(new char[10000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		h1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		h2 = tempVar3.charAt(0);
	}
	total1 = (int)h1.length();
	total2 = (int)h2.length();

	if (total1 != total2)
	{
		System.out.print("error");
		return 0;
	}
	else
	{
		for (i = 0;i < total1;i++)
		{
					if ((h1.charAt(i) == 'A' || h1.charAt(i) == 'T' || h1.charAt(i) == 'C' || h1.charAt(i) == 'G') && (h2.charAt(i) == 'A' || h2.charAt(i) == 'T' || h2.charAt(i) == 'C' || h2.charAt(i) == 'G'))
					{
						if (h1.charAt(i) == h2.charAt(i))
						{
							same++;
						}
					}
					else
					{
						System.out.print("error");
						return 0;
					}
		}
	}
	if (((double)same / (double)total1) > k)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}

	return 0;
	}


}

