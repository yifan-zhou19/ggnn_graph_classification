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
		for (i = 0;i < n;i++)
		{
			char m;
			do
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					m = tempVar2.charAt(0);
				}
				if (m == 'A')
				{
					System.out.print("T");
				}
				else if (m == 'T')
				{
					System.out.print("A");
				}
				else if (m == 'G')
				{
					System.out.print("C");
				}
				else if (m == 'C')
				{
					System.out.print("G");
				}
			}while (m != '\n');
			System.out.print("\n");
		}
		return 0;
	}

}

