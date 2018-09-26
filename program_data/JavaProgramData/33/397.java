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
		for (int i = 0;i < n;i++)
		{
			String line = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line = tempVar2.charAt(0);
			}
			for (int j = 0;j < 256;j++)
			{
				if (line.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (line.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (line.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (line.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				else
				{
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

