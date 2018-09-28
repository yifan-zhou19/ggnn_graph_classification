package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] temp = new int[1000];
		String cr = new String(new char[21]);
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
				cr = tempVar2.charAt(0);
			}
			if ((cr.charAt(0) >= 'a' && cr.charAt(0) <= 'z') || (cr.charAt(0) >= 'A' && cr.charAt(0) <= 'Z') || cr.charAt(0) == '_')
			{
				for (j = 1;j < 20;j++)
				{
					if ((cr.charAt(j) >= 'a' && cr.charAt(j) <= 'z') || (cr.charAt(j) >= 'A' && cr.charAt(j) <= 'Z') || (cr.charAt(j) >= '0' && cr.charAt(j) <= '9') || cr.charAt(j) == '_')
					{
						continue;
					}
					else if (cr.charAt(j) == '\0')
					{
						temp[i] = 1;
						break;
					}
					else
					{
						temp[i] = 0;
						break;
					}

				}
			}
			else
			{
				temp[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (temp[i] == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

