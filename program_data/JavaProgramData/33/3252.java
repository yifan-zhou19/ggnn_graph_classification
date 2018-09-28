package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
			if (a.charAt(j) == 'C')
			{
				System.out.print("G");
			}
			else if (a.charAt(j) == 'G')
			{
				System.out.print("C");
			}
			else if (a.charAt(j) == 'T')
			{
				System.out.print("A");
			}
			else
			{
				System.out.print("T");
			}
			}
		System.out.print("\n");
		}
		return 0;
	}
}

