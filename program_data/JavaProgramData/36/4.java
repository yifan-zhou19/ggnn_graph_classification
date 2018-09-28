package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a1 = new int[123];
		int[] a2 = new int[123];
		int i;
		int j;
		char[] c1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] c2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		if (c1.length() != c2.length())
		{
			System.out.print("NO\n");
		}
		else
		{
				for (i = 0;i <= c1.length() - 1;i++)
				{
					a1[c1[i]] = a1[c1[i]] + 1;
					a2[c2[i]] = a2[c2[i]] + 1;
				}
			for (i = 0;i <= 122;i++)
			{
				if (a1[i] != a2[i])
				{
					System.out.print("NO\n");
					break;
				}
			}
			if (i == 123)
			{
				System.out.print("YES\n");
			}
		}
	}
}

