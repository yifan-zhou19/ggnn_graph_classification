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
		for (int i = 0;i < n;i++)
		{
			char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			int len = c.length();
			int judge = 0;
			if (!Character.isLetter(c[0]) && c[0] != '_')
			{
				System.out.print("no\n");
				judge = 1;
			}
			else
			{
				for (int j = 1;j < len;j++)
				{
					if (!Character.isLetterOrDigit(c[j]) && c[j] != '_')
					{
						System.out.print("no\n");
						judge = 1;
						break;
					}
				}
			}
			if (judge == 0)
			{
				System.out.print("yes\n");
			}
		}
	}
}

