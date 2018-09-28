package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] zfc = new char[10000][256];
		String ps;
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
			for (ps = zfc[i]; ps != '\0';ps++)
			{
				if (ps == 65)
				{
					System.out.print("T");

				}
				else if (ps == 84)
				{
					System.out.print("A");
				}
				else if (ps == 71)
				{
					System.out.print("C");
				}
				else if (ps == 67)
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

