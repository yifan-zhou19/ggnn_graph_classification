package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z1 = new String(new char[500]);
		String z2 = new String(new char[500]);
		int l = 1;
		double q;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z2 = tempVar3.charAt(0);
		}
			if (z1.length() != z2.length())
			{
				System.out.print("error");
				l = 0;
			}
			else
			{
				for (int i = 0;i < z1.length();i++)
				{
					if ((z1.charAt(i) != 'A' && z1.charAt(i) != 'T' && z1.charAt(i) != 'G' && z1.charAt(i) != 'C') || (z2.charAt(i) != 'A' && z2.charAt(i) != 'T' && z2.charAt(i) != 'G' && z2.charAt(i) != 'C'))
					{
						System.out.print("error");
						l = 0;
						break;
					}
					else if (z1.charAt(i) == z2.charAt(i))
					{
						q++;
					}
				}
			}
		if (q / z1.length() > m && l == 1)
		{
			System.out.print("yes");
		}
		else if (l == 1)
		{
			System.out.print("no");
		}
	return 0;
	}
}

