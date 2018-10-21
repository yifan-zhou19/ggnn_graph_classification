package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		int[] geshu = new int[52];
		String zimu = new String(new char[52]);
		int i;
		int j;
		int s = 0;
		int n;
		for (i = 0;i < 26;i++)
		{
			geshu[i] = 0;
			zimu = tangible.StringFunctions.changeCharacter(zimu, i, 65 + i);
		}
		for (i = 26;i < 52;i++)
		{
			geshu[i] = 0;
			zimu = tangible.StringFunctions.changeCharacter(zimu, i, 71 + i);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		n = zfc.length();
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 52;i++)
			{
				if (zfc.charAt(j) == zimu.charAt(i))
				{
					geshu[i] += 1;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (geshu[i] != 0)
			{
				s += geshu[i];
			  System.out.printf("%c=%d\n",zimu.charAt(i),geshu[i]);
			}
		}
		if (s == 0)
		{
				System.out.print("No");
		}
		return 0;
	}
}

