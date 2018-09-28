package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m = 0;
		int n = 0;
		int total = 0;
		int zong = 0;
		int A = 1;
		double bl;
		double suande;
		String z1 = new String(new char[100]);
		String z2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl = Double.parseDouble(tempVar);
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
		for (i = 0;z1.charAt(i) != '\0';i++)
		{
			m++;
		}
		for (i = 0;z2.charAt(i) != '\0';i++)
		{
			n++;
		}
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;z1.charAt(i) != '\0';i++)
			{
				zong++;
				if (((z1.charAt(i) != 'A') && (z1.charAt(i) != 'T') && (z1.charAt(i) != 'C') && (z1.charAt(i) != 'G')) || ((z2.charAt(i) != 'A') && (z2.charAt(i) != 'T') && (z2.charAt(i) != 'C') && (z2.charAt(i) != 'G')))
				{
					A = 0;
					break;
				}
				else
				{
					if (z1.charAt(i) == z2.charAt(i))
					{
						total++;
					}
				}
			}
			suande = 1.0 * total / zong;
			if ((A == 1) && (suande <= bl))
			{
				System.out.print("no");
			}
			else if ((A == 1) && (suande > bl))
			{
				System.out.print("yes");
			}
			else if (A == 0)
			{
				System.out.print("error");
			}
			else
			{
				System.out.print("a");
			}
		}


		return 0;
	}








}

