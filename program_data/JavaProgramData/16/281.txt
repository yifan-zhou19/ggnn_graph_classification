package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[20]);
		System.out.print("\n");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		s = String.format("%d", i);
		for (i = s.length() - 1; i >= 0; i--)
		{
			System.out.printf("%c", s.charAt(i));
		}
		System.out.println("\n");

		return 0;
	}

}

