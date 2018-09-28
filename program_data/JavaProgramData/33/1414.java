package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char input;
		char output;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			input = tempVar2.charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 255;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					input = tempVar3.charAt(0);
				}
				if (input == 'A')
				{
					System.out.print("T");
				}
				else if (input == 'T')
				{
					System.out.print("A");
				}
				else if (input == 'G')
				{
					System.out.print("C");
				}
				else if (input == 'C')
				{
					System.out.print("G");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}




}

