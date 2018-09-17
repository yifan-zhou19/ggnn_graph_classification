package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[300]);
		int[] letter = new int[26];
		int i;
		int j;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		for (i = 0;sz.charAt(i) != '\0';i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (sz.charAt(i) == 97 + j)
				{
				letter[j]++;
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (letter[j] != 0)
			{
				 System.out.printf("%c=%d\n",97 + j,letter[j]);
				x++;
			}
		}
		if (x == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

