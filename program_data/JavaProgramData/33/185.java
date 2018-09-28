package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int a;
		for (i = 0;i < n;i++)
		{
			String zfc = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			a = zfc.length();
			int j;
			for (j = 0;j < a - 1;j++)
			{
				if (zfc.charAt(j) == 'A')
				{
					System.out.printf("%c",'T');
				}

				else if (zfc.charAt(j) == 'T')
				{
					System.out.printf("%c",'A');
				}

				else if (zfc.charAt(j) == 'G')
				{
					System.out.printf("%c",'C');
				}

				else if (zfc.charAt(j) == 'C')
				{
					System.out.printf("%c",'G');
				}

			}
				if (zfc.charAt(j) == 'A')
				{
					System.out.printf("%c\n",'T');
				}
				else if (zfc.charAt(j) == 'T')
				{
					System.out.printf("%c\n",'A');
				}
				else if (zfc.charAt(j) == 'G')
				{
					System.out.printf("%c\n",'C');
				}
				else if (zfc.charAt(j) == 'C')
				{
					System.out.printf("%c\n",'G');
				}
		}
		return 0;
	}
}

