package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int k = s.length();
			int w = 0;
			for (j = 0;j < k;j++)
			{
				if (j == 0 && s[j] >= '0' && s[j] <= '9')
				{
					System.out.print("no\n");
					break;
				}

				if ((s[j] >= 'a' && s[j] <= 'z') || (s[j] >= 'A' && s[j] <= 'Z') || (s[j] >= '0' && s[j] <= '9') || s[j] == '_')
				{
					w++;
				}
			}
			if (s[0] >= '0' && s[0] <= '9')
			{
				continue;
			}
			if (w == k)
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

