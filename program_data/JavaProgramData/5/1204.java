package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a1;
		int a2;
		int sum;
		double m;
		double x;
		String s1 = new String(new char[502]);
		String s2 = new String(new char[502]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		a1 = s1.length();
		a2 = s2.length();
		sum = 0;
		if (a1 != a2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;s1.charAt(i);i++)
			{
				if (((s1.charAt(i) != 'A') && (s1.charAt(i) != 'T') && (s1.charAt(i) != 'C') && (s1.charAt(i) != 'G')) || ((s2.charAt(i) != 'A') && (s2.charAt(i) != 'T') && (s2.charAt(i) != 'C') && (s2.charAt(i) != 'G')))
				{
					sum = -1;
					break;
				}
				else if (s1.charAt(i) == s2.charAt(i))
				{
					sum++;
				}
			}
			if (sum == -1)
			{
				System.out.print("error");
			}
			else
			{
				x = (double)sum / a1;
				if (x > m)
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

