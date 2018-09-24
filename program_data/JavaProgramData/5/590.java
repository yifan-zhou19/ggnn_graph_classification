package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		int i;
		int j;
		int m;
		int sum = 0;
		int SUM = 0;
		double e;
		double n;



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
		String tempVar3 = ConsoleInput.scanfRead();
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
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C') && (a.charAt(i) != 'T')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'G') && (b.charAt(i) != 'C') && (b.charAt(i) != 'T')))
				{
					SUM++;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
						sum++;
				}
			}
			if (SUM != 0)
			{
				System.out.print("error");
			}
			else
			{
				m = a.length();
				e = (double)sum / m;
				if (e > n)
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

