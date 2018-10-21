package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int k;
		int m;
		int o;
		char[][] zfc = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			o = 0;
			p = String.valueOf(zfc[i]).length();
			if ((zfc[i][0] >= 65 && zfc[i][0] <= 90) || (zfc[i][0] >= 97 && zfc[i][0] <= 122) || zfc[i][0] == 95)
			{
				o = o;
			}
			else
			{
				o = o + 1;
			}
			for (k = 1;k < p;k++)
			{
				m = zfc[i][k];
				if ((m >= 65 && m <= 90) || (m >= 97 && m <= 122) || (m >= 48 && m <= 57) || (m == 95))
				{
					o = o;
				}
				else
				{
					o = o + 1;
				}
			}
			if (o == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

