package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 1;
		int t;
		int kong;
		int[] cs = new int[100];
		int d;
		String zfc = new String(new char[1000]);
		String zf = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			zf = tangible.StringFunctions.changeCharacter(zf, 0, zfc.charAt(0));
			cs[0] = 1;
			for (j = 1;j < 100;j++)
			{
				cs[j] = 0;
			}
			for (j = 1;j < zfc.length();j++)
			{
				kong = 0;
				for (k = 0;k < n;k++)
				{
					if (zfc.charAt(j) == zf.charAt(k))
					{
						kong = 1;
						cs[k] = cs[k] + 1;
						break;
					}
				}
				if (kong == 0)
				{
					zf = tangible.StringFunctions.changeCharacter(zf, n, zfc.charAt(j));
					cs[n] = cs[n] + 1;
					n = n + 1;
					d = n;
				}
			}
			 kong = 0;
			for (j = 0;j < d;j++)
			{

				if (cs[j] == 1)
				{
					System.out.printf("%c\n",zf.charAt(j));
					kong = 1;
					break;
				}



			}

			if (kong == 0)
			{
				System.out.print("no\n");
			}

		}

	return 0;
	}

}

