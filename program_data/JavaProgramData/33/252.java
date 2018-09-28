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
		while (n-- != 0)
		{
			String a = new String(new char[500]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int LL = a.length();
			for (int i = 0; i < LL;i++)
			{
				if (a.charAt(i) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(i) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(i) == 'G')
				{
					System.out.print("C");
				}
				if (a.charAt(i) == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

