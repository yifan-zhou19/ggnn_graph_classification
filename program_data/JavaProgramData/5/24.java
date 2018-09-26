package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		int bar = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		char[][] zfc = new char[2][500];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc[1] = tempVar3.charAt(0);
		}
		float count = 0.0F;
		if (String.valueOf(zfc[0]).length() != String.valueOf(zfc[1]).length())
		{
			System.out.print("error");
		}
		else
		{
			float len = String.valueOf(zfc[0]).length();
			for (int i = 0;i < len;i++)
			{
				if ((zfc[0][i] != 'A' && zfc[0][i] != 'T' && zfc[0][i] != 'C' && zfc[0][i] != 'G') || (zfc[1][i] != 'A' && zfc[1][i] != 'T' && zfc[1][i] != 'C' && zfc[1][i] != 'G'))
				{
					System.out.print("error");
					bar = 1;
					break;
				}
				else if (zfc[0][i] == zfc[1][i])
				{
					count += 1.0;
				}
			}
			 if (count / len >= a != 0 && bar == 0)
			 {
				System.out.print("yes");
			 }
			if (count / len < a && bar == 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

