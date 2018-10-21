package <missing>;

public class GlobalMembers
{
	public static int compare(char x, char y)
	{
		if ((x == 'A' && y == 'A') || (x == 'T' && y == 'T') || (x == 'C' && y == 'C') || (x == 'G' && y == 'G'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		double n;
		String DNA1 = new String(new char[502]);
		String DNA2 = new String(new char[502]);
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			DNA1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			DNA2 = tempVar3.charAt(0);
		}
		len1 = DNA1.length();
		len2 = DNA2.length();
		int i;
		int m = 0;
		int e;
		int p = 0;
		double result;
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				e = compare(DNA1.charAt(i), DNA2.charAt(i));
				if (e == 1)
				{
					m++;
				}
				if ((DNA1.charAt(i) != 'A' && DNA1.charAt(i) != 'T' && DNA1.charAt(i) != 'G' && DNA1.charAt(i) != 'C') || (DNA2.charAt(i) != 'A' && DNA2.charAt(i) != 'T' && DNA2.charAt(i) != 'G' && DNA2.charAt(i) != 'C'))
				{
					System.out.print("error");
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				result = ((double)m / (double)len1);
				if (result > n)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}
}

