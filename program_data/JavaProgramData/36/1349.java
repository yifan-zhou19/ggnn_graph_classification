package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] c1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] c2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		l1 = c1.length();
		l2 = c2.length();
		if (l1 != l2)
		{
			System.out.print("NO\n");
			return 0;
		}
		for (i = 0;i < l1;i++)
		{
			for (j = 0;j < l2;j++)
			{
				if (c1[i] == c2[j])
				{
					c2[j] = 0;
					break;
				}
				if (j == l2 - 1)
				{
					System.out.print("NO\n");
					return 0;
				}
			}
		}
		System.out.print("YES\n");
		return 0;
	}

}

