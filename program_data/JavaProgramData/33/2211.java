package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int len;
		int i;
		int j;
		String a = new String(new char[256]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			for (j = 0;j < len;j++)
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


	}

}

