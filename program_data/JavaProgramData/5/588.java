package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int e;
		int count = 0;
		int i;
		double result;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		c = a.length();
		d = b.length();
		if (c != d)
		{
		System.out.print("error");
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
				{
					System.out.print("error");
					result = -1;
					break;
				}
				else
				{

				if (a.charAt(i) == b.charAt(i))
				{
				count++;
				}
				}
			}
			if (result != -1)
			{

			result = (double)count / c;
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

