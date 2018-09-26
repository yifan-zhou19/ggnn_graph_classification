package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			scanf("\n");
			do
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					z = tempVar2.charAt(0);
				}
				if (z == 'A')
				{
					System.out.print("T");
				}
				else if (z == 'T')
				{
					System.out.print("A");
				}
				else if (z == 'C')
				{
					System.out.print("G");
				}
				else if (z == 'G')
				{
					System.out.print("C");
				}
			}while (z != '\n');
			System.out.print("\n");
		}
		return 0;
	}
}

