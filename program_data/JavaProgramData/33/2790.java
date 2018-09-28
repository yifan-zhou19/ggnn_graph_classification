package <missing>;

public class GlobalMembers
{
	public static char anti_base(char base)
	{
		char anti;
			if (base == 'A')
			{
				anti = 'T';
			}
			if (base == 'T')
			{
				anti = 'A';
			}
			if (base == 'G')
			{
				anti = 'C';
			}
			if (base == 'C')
			{
				anti = 'G';
			}
			return anti;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sequence = new char[n][300];
		char a;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sequence[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;;j++)
		{
			if (sequence[i][j] != 0)
			{
				 a = anti_base(sequence[i][j]);
				System.out.printf("%c",a);
			}
			else
			{
				break;
			}
		}
		 System.out.print("\n");
		}


	}
}

