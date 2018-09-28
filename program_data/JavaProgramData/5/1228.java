package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double bi;
		double p;
		int len1;
		int len2;
		int i;
		int flag;
		int s = 0;
		char[][] zfc = new char[2][501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bi = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		len1 = String.valueOf(zfc[0]).length();
		len2 = String.valueOf(zfc[1]).length();
		if (len1 != len2)
		{
			flag = 1;
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
			   if ((zfc[0][i] != 'A' && zfc[0][i] != 'T' && zfc[0][i] != 'G' && zfc[0][i] != 'C') || (zfc[1][i] != 'A' && zfc[1][i] != 'T' && zfc[1][i] != 'G' && zfc[1][i] != 'C'))
			   {
				  flag = 1;
			   }

			   else
			   {
				 flag = 0;
			   }
			}
		}
		if (flag == 1)
		{
			System.out.print("error");
		}
		else if (flag == 0)
		{
			for (i = 0;i < len1;i++)
			{
				if (zfc[0][i] == zfc[1][i])
				{
					s = s + 1;
				}
				else
				{
					s = s;
				}
			}
			p = s * 1.0 / len1;
			if (p > bi)
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

