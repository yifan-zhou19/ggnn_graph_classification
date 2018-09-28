package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		d = Double.parseDouble(tempVar);
	}
	String s = new String(new char[100]);
	String u = new String(new char[100]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		u = tempVar3.charAt(0);
	}
	int f = 0;
	int t = 0;
	int i;
	int r = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			t++;
		}
	for (i = 0;u.charAt(i) != '\0';i++)
	{
			r++;
	}
	if (r != t)
	{
		System.out.print("error\n");
		return 0;
	}
	else
	{
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G')
			{
				System.out.print("error\n");
				return 0;
			}
			else if (u.charAt(i) != 'A' && u.charAt(i) != 'T' && u.charAt(i) != 'C' && u.charAt(i) != 'G')
			{
				System.out.print("error\n");
				return 0;
			}
			else if (s.charAt(i) == u.charAt(i))
			{
				f++;
			}
		}
			if (f * 1.0 / t >= d)
			{
			System.out.print("yes\n");
			return 0;
			}
			else
			{
			System.out.print("no\n");
			return 0;
			}

	}
		return 0;
	}

}

