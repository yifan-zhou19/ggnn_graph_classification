package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String k = new String(new char[1000]);
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			k = new Scanner(System.in).nextLine();
			for (j = 0;k.charAt(j) != '\0';j++)
			{
				if (k.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (k.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (k.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (k.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}
			if (k.charAt(j) == '\0')
			{
				System.out.print("\n");
			}
		}
		return 0;

	}

}

