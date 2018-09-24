package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String DNA1 = new String(new char[501]);
		String DNA2 = new String(new char[501]);
		double rate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			DNA1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			DNA2 = tempVar3.charAt(0);
		}
		int i;
		int len1;
		int len2;
		int flag = 0;
		len1 = DNA1.length();
		len2 = DNA2.length();
		if (len1 != len2)
		{
		flag = 1;
		}
		for (i = 0;i < len1;i++)
		{
			if (DNA1.charAt(i) == 'A' || DNA1.charAt(i) == 'T' || DNA1.charAt(i) == 'C' || DNA1.charAt(i) == 'G')
			{
			continue;
			}
			else
			{
				flag = 1;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (DNA2.charAt(i) == 'A' || DNA2.charAt(i) == 'T' || DNA2.charAt(i) == 'C' || DNA2.charAt(i) == 'G')
			{
			continue;
			}
			else
			{
				flag = 1;
			}
		}
		if (flag == 1)
		{
		System.out.print("error\n");
		}
		else
		{
		int c = 0;
		double result;
		for (i = 0;DNA1.charAt(i);i++)
		{
			if (DNA1.charAt(i) == DNA2.charAt(i))
			{
			c++;
			}
		}
		result = 1.0 * c / len1;
		if (result > rate)
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

