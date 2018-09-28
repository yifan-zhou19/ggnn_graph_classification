package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double xgx;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xgx = Double.parseDouble(tempVar);
		}
		int i;
		int j;
		int k;
		int l = 0;
		int m = 0;
		String jy1 = new String(new char[10086]);
		String jy2 = new String(new char[10086]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jy1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jy2 = tempVar3.charAt(0);
		}
		j = jy1.length();
		k = jy2.length();
		jy1 = tangible.StringFunctions.changeCharacter(jy1, j, '\0');
		jy2 = tangible.StringFunctions.changeCharacter(jy2, k, '\0');
		if (j != k)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if (((jy1.charAt(i) != 'A') && (jy1.charAt(i) != 'T') && (jy1.charAt(i) != 'C') && (jy1.charAt(i) != 'G')) || ((jy2.charAt(i) != 'A') && (jy2.charAt(i) != 'T') && (jy2.charAt(i) != 'C') && (jy2.charAt(i) != 'G')))
				{
					l++;
				}
			}
				if (l != 0)
				{
					System.out.print("error\n");
				}
				else
				{
					for (i = 0;i < j;i++)
					{
						if (jy1.charAt(i) == jy2.charAt(i))
						{
							m++;
						}
					}
				n = 1.0 * m / j;
				if (n > xgx)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
				}
		}
		return 0;
	}
}

