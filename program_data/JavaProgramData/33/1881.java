package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		char[][] gen = new char[1000][1000];
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
				gen[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < (int)String.valueOf(gen[i]).length();j++)
			{
				if (gen[i][j] == 65)
				{
					System.out.print("T");
				}
				if (gen[i][j] == 84)
				{
					System.out.print("A");
				}
				if (gen[i][j] == 67)
				{
					System.out.print("G");
				}
				if (gen[i][j] == 71)
				{
					System.out.print("C");
				}
			}
			{
				System.out.print("\n");
		}
		}

	}

}

