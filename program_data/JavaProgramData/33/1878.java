package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[255]);
		 int len;

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
				a = tempVar2.charAt(0);
			}
			len = a.length();
			for (j = 0;j < len - 1;j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}

				else if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}

			if (a.charAt(len - 1) == 'A')
			{
					System.out.print("T\n");
			}
			else if (a.charAt(len - 1) == 'T')
			{
					System.out.print("A\n");
			}
			else if (a.charAt(len - 1) == 'C')
			{
					System.out.print("G\n");
			}
			else if (a.charAt(len - 1) == 'G')
			{
					System.out.print("C\n");
			}
		}

		return 0;

	}
}

