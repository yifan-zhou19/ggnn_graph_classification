package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		int tag = 1;
		double xsd;
		char[][] zfc = new char[2][500];
		int len;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		for (int i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		len = String.valueOf(zfc[0]).length();
		for (int j = 0;j < len;j++)
		{
			if ((zfc[0][j] != 'A') && (zfc[0][j] != 'G') && (zfc[0][j] != 'C') && (zfc[0][j] != 'T'))
			{
				tag = 0;
				break;
			}
			if (zfc[0][j] == zfc[1][j])
			{
				count++;
			}
		}
		xsd = (double)count / len;
		if (tag == 0)
		{
				System.out.print("error");
		}
		else if (String.valueOf(zfc[0]).length() != String.valueOf(zfc[1]).length())
		{
			System.out.print("error");
		}

		else if (xsd > m)
		{
			System.out.print("yes");
		}
		else if (xsd <= m)
		{
			System.out.print("no");
		}

		return 0;
	}


}

