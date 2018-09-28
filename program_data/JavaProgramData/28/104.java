package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[300][20];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[0] = tempVar.charAt(0);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		System.out.printf("%d",String.valueOf(c[0]).length());
		for (i = 1;c[i][0] != '\0';i++)
		{
		System.out.printf(",%d",String.valueOf(c[i]).length());
		}
	}
}

