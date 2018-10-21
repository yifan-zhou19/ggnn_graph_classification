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
		String zfc = new String(new char[1000]);
	zfc = new Scanner(System.in).nextLine();
		for (int j = 0;j < n;j++)
		{
		   zfc = new Scanner(System.in).nextLine();
			for (int i = 0;;i++)
			{
			if (zfc.charAt(i) == 'A')
			{
				System.out.print("T");
				continue;
			}
			if (zfc.charAt(i) == 'T')
			{
				System.out.print("A");
				continue;
			}
			if (zfc.charAt(i) == 'C')
			{
				System.out.print("G");
				continue;
			}
			if (zfc.charAt(i) == 'G')
			{
				System.out.print("C");
				continue;
			}

			if (zfc.charAt(i) == '\0')
			{
				System.out.print("\n");
				break;
			}
			}
		}
		return 0;
	}



}

