package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		double s;
		int i;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		char c;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			d = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = tempVar5.charAt(0);
		}
		s = 0;
		if (a.length() != b.length())
		{
								System.out.print("error");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{

									if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
									{
									System.out.print("error");
									return 0;
									}
									if (a.charAt(i) == b.charAt(i))
									{
												  s++;
									}
			}
			if (s / a.length() >= r)
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

