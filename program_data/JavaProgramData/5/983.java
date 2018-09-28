package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int y;
		int s;
		int g = 0;
		double rate;
		double t;
		String a = new String(new char[510]);
		String b = new String(new char[510]);
		s = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
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
		x = a.length();
		y = b.length();
		if (x != y)
		{
			 System.out.print("error");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G') && (a.charAt(i) != 'T')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G') && (b.charAt(i) != 'T')))
				{

				   g = 1;
				}
				else if (a.charAt(i) == b.charAt(i))
				{
				   s++;
				}
			}
		t = rate * x;
		if (g == 0)
		{
			if (s > t)
			{
			  System.out.print("yes");
			}
		   else
		   {
			  System.out.print("no");
		   }
		}
		else
		{
			System.out.print("error");
		}

		}

	return 0;
	}

}

