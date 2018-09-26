package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		String e = new String(new char[100]);

		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}
			}
			System.out.print("\n");
		}

	}

}

