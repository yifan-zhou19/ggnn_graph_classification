package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a = 0;
		int l = 0;
		double m;
		double n;
		char[][] zf = new char[2][10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zf[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zf[1] = tempVar3.charAt(0);
		}
		j = String.valueOf(zf[0]).length();
		k = String.valueOf(zf[1]).length();
		for (i = 0;zf[0][i] != '\0' && zf[1][i] != '\0';i++)
		{
			if ((zf[0][i] > 'a' && zf[0][i] < 'z') || (zf[1][i]>'a' && zf[1][i] < 'z'))
			{
				l++;
			}
		}
		if (j != k || l > 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;zf[0][i] != '\0';i++)
			{
				if (zf[0][i] == zf[1][i])
				{
					a = a + 1;
				}
			}
				n = 1.0 * a / j;
				if (n >= m)
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

