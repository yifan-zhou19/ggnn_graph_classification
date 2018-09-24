package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}


		return 0;
	}

}

