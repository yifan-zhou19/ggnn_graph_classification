package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double b;
		double c;
		char[][] D = new char[2][501];
		int z;
		int t;
		z = t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			D[1] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			D[0] = tempVar3.charAt(0);
		}
		if (String.valueOf(D[1]).length() != String.valueOf(D[0]).length())
		{
			System.out.print("error");
			return 0;
		}
		z = String.valueOf(D[1]).length();
		for (int i = 0;D[1][i];i++)
		{
			if ((D[1][i] != 'A' && D[1][i] != 'T' && D[1][i] != 'C' && D[1][i] != 'G') || (D[0][i] != 'A' && D[0][i] != 'T' && D[0][i] != 'C' && D[0][i] != 'G'))
			{
				System.out.print("error");
				return 0;
			}
			  if (D[1][i] == D[0][i])
			  {
				t++;
			  }
		}
		c = (double)t / (double)z;
		if (c >= b)
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

