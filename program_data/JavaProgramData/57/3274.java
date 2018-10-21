package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		String string = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			String = new Scanner(System.in).nextLine();
			m = String.length();
			for (j = 0;j < m;)
			{
			j++;
			}
				if (String[m - 1] == 'r' || string.charAt(m - 1) == 'y')
				{
					m = m - 2;
				}
				if (String[m - 1] == 'g')
				{
					m = m - 3;
				}
					for (j = 0;j < m;j++)
					{
					System.out.printf("%c",string.charAt(j));
					}
					System.out.print("\n");
		}
	}
}

