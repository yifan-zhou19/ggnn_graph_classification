package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int h = 1;
		int la;
		int lb;
		double s;
		double r;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (((a.charAt(i) != 'A') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C') && (a.charAt(i) != 'T')) || ((b.charAt(i) != 'A') && (b.charAt(i) != 'G') && (b.charAt(i) != 'C') && (b.charAt(i) != 'T')))
				{
					System.out.print("error");
					h = 0;
					break;
				}
			}
			if (h == 1)
			{
				for (i = 0;a.charAt(i) != '\0';i++)
				{
					if (a.charAt(i) == b.charAt(i))
					{
						j++;
					}
				}
				r = (double)j / (double)la;
				if (r >= s)
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

