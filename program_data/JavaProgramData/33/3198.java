package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		String s = new String(new char[300]);
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
			len = s.length();
			for (i = 0; i < len; i++)
			{
				switch (s.charAt(i))
				{
					case 'A':
						System.out.print("T");
						break;
					case 'T':
						System.out.print("A");
						break;
					case 'G':
						System.out.print("C");
						break;
					case 'C':
						System.out.print("G");
						break;
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

