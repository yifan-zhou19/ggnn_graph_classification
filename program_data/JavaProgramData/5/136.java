package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		double n;
		int i;
		int j;
		int k;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G')))
				{
					System.out.print("error");
				return 0;
				}
			}
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					sum += 1;
				}
			}
			if ((sum / a.length()) > n)
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

