package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[300]);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			i = 0;
			while (s.charAt(i) != '\0')
			{
				if (s.charAt(i) == 'A')
				{
				System.out.print("T");
				}
				if (s.charAt(i) == 'T')
				{
				System.out.print("A");
				}
				if (s.charAt(i) == 'G')
				{
				System.out.print("C");
				}
				if (s.charAt(i) == 'C')
				{
				System.out.print("G");
				}
				i++;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

