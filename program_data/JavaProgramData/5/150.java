package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] z = new char[2][650];
		double res;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			res = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z[1] = tempVar3.charAt(0);
		}
		int n = String.valueOf(z[0]).length();
		int n2 = String.valueOf(z[1]).length();
		res = res * 1.0 * n;
		int h = 0;
		int refer = 0;
		for (int i = 0;i < n;i++)
		{
			if (z[0][i] != 'A' && z[0][i] != 'T' && z[0][i] != 'G' && z[0][i] != 'C')
			{
				System.out.print("error");
				refer = 1;
				break;
			}
			 else if (z[1][i] != 'A' && z[1][i] != 'T' && z[1][i] != 'G' && z[1][i] != 'C')
			 {
				System.out.print("error");
				refer = 1;
				break;
			 }
			else if (z[0][i] == z[1][i])
			{
				h++;
			}
		}
		if (refer == 0)
		{
			if (n != n2)
			{
				System.out.print("error");
			}
			else if (h >= res)
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

