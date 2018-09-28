package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		String s = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
		while (s.charAt(j) != '\0')
		{
			if (s.charAt(j) == 'A')
			{
				System.out.print("T");
			}
			if (s.charAt(j) == 'T')
			{
				System.out.print("A");
			}
			if (s.charAt(j) == 'G')
			{
				System.out.print("C");
			}
			if (s.charAt(j) == 'C')
			{
				System.out.print("G");
			}
			j++;
		}
		System.out.print("\n");
		}
		return 0;
	}


}

