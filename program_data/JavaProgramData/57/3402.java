package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
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
				if (a.charAt(i) == 'e' && a.charAt(i + 1) == 'r' && a.charAt(i + 2) == '\0' || a.charAt(i) == 'l' && a.charAt(i + 1) == 'y' && a.charAt(i + 2) == '\0' || a.charAt(i) == 'i' && a.charAt(i + 1) == 'n' && a.charAt(i + 2) == 'g' && a.charAt(i + 3) == '\0')
				{
				break;
				}
				else
				{
				System.out.printf("%c",a.charAt(i));
				}
			}
			System.out.print("\n");
		}
	}

}

