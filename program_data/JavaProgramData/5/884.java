package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double n;
		int i;
		String A = new String(new char[1000]);
		String B = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			B = tempVar3.charAt(0);
		}
		a = A.length();
		b = B.length();
		if (a != b)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0,b = 0;i < a;i++)
		{
			if ((A.charAt(i) != 'A' && A.charAt(i) != 'T' && A.charAt(i) != 'C' && A.charAt(i) != 'G') || (B.charAt(i) != 'A' && B.charAt(i) != 'T' && B.charAt(i) != 'C' && B.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			if (A.charAt(i) == B.charAt(i))
			{
				b++;
			}
		}
		a = b / a;
		if (a >= n)
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

