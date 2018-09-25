package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k = 1;
		String name = new String(new char[21]);
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
				name = tempVar2.charAt(0);
			}
			for (j = 0;name.charAt(j) != '\0';j++)
			{
				if (name.charAt(j) == '_' || (name.charAt(j) >= '0' && name.charAt(j) <= '9' && j != 0) || (name.charAt(j) >= 'a' && name.charAt(j) <= 'z') || (name.charAt(j) >= 'A' && name.charAt(j) <= 'Z'))
				{
					continue;
				}
				else
				{
					k = 0;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
			k = 1;
		}
		return 0;
	}
}

