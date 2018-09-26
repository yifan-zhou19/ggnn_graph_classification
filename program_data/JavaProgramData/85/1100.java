package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int judge = 0;
		String zfc = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.in.read();
			}
			zfc = new Scanner(System.in).nextLine();
			for (j = 1;j < zfc.length();j++)
			{
				if ((zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || zfc.charAt(0) == '_')
				{
					judge = 1;
					if ((zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || zfc.charAt(j) == '_' || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9'))
					{
						judge = 1;
					}
					else
					{
						judge = 0;
						break;
					}
				}
				else
				{
					judge = 0;
					break;
				}
			}

			if (judge == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

