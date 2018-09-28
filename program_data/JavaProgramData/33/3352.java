package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == 'A')
				{
				System.out.print("T");
				}
				if (a.charAt(i) == 'T')
				{
				System.out.print("A");
				}
				if (a.charAt(i) == 'C')
				{
				System.out.print("G");
				}
				if (a.charAt(i) == 'G')
				{
				System.out.print("C");
				}
			}
			System.out.print("\n");
		}
	}

}

