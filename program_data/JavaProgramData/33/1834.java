package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	char[][] m = new char[10000][256];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[j] = tempVar2.charAt(0);
			}
	}
	for (int j = 0;j < n;j++)
	{
			for (int i = 0;i < String.valueOf(m[j]).length();i++)
			{
			if (m[j][i] == 'A')
			{
				m[j][i] = 'T';
			}
			else if (m[j][i] == 'T')
			{
				m[j][i] = 'A';
			}
			else if (m[j][i] == 'G')
			{
				m[j][i] = 'C';
			}
			else if (m[j][i] == 'C')
			{
				m[j][i] = 'G';
			}
			System.out.printf("%c",m[j][i]);
			}
			System.out.print("\n");
	}


	return 0;
	}
}

