package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		char a; //[300];
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
		while (n-- != 0)
		{
			while (true)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tempVar3.charAt(0);
				}
				if (a == 'A')
				{
					System.out.print("T");
				}
				if (a == 'T')
				{
					System.out.print("A");
				}
				if (a == 'C')
				{
					System.out.print("G");
				}
				if (a == 'G')
				{
					System.out.print("C");
				}
				if (a == '\n')
				{
					System.out.print("\n");
					break;
				}
			}
			//memset(a, 0, sizeof(a)); 
		}
		return 0;
	}
}

