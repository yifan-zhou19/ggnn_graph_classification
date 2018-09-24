package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 0;
		double t;
		double k = 0;
		final String s = "";
		final String x = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x = tempVar3.charAt(0);
		}
		for (a = 0;s.charAt(a) != '\0';a++)
		{
			if (s.charAt(a) > 'Z')
			{
				k = 1;
				break;
			}
		}
		for (b = 0;x.charAt(b) != '\0';b++)
		{
			if (x.charAt(b) > 'Z')
			{
				k = 1;
				break;
			}
		}
		if (a != b || k == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (a = 0;a < b;a++)
			{
				if (s.charAt(a) == x.charAt(a))
				{
					c++;
				}
			}
			k = 1.0 * c / b;
			if (k > t)
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

