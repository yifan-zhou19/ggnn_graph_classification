package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		String zfc = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			if ((zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || (zfc.charAt(0) == '_'))
			{
				a = 1;
			}
			else
			{
				a = 0;
			}
			if (a == 1)
			{
				for (i = 1;zfc.charAt(i) != '\0';i++)
				{
					if ((zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z') || (zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z') || (zfc.charAt(i) == '_') || (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9'))
					{
						b = 1;
					}
					else
					{
						b = 0;
						break;
					}
				}
			}
			if (a == 1 && b == 1)
			{
				System.out.print("yes\n");
			}
			else if (a == 0 || (a == 1 && b == 0))
			{
				System.out.print("no\n");
			}
			n--;
		}
		return 0;
	}

}

