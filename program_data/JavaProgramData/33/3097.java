package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{

			for (j = 0;j < 260;j++)
			{

				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tempVar3.charAt(0);
				}
				if (a == '\n')
				{
					System.out.print("\n");
					break;
				}
				else if (a == 'A')
				{
					System.out.print("T");
				}
				else if (a == 'T')
				{
					System.out.print("A");
				}
				else if (a == 'G')
				{
					System.out.print("C");
				}
				else if (a == 'C')
				{
					System.out.print("G");
				}
			}
		}
		return 0;
	}
}

