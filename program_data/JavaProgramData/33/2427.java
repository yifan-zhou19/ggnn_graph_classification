package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			while (true)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c = tempVar2.charAt(0);
				}
				if (c == '\n')
				{
				break;
				}
				else if (c == 'A')
				{
					System.out.print("T");
				}
				else if (c == 'T')
				{
					System.out.print("A");
				}
				else if (c == 'G')
				{
					System.out.print("C");
				}
				else if (c == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");

		}

		return 0;
	}
}

