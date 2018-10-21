package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int word = 0;
		int len;
		int i;
		int l = 0;
		int[] ans = new int[300];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c != ' ' && c != '\n' && word == 0)
			{
					word = 1;
					len = 1;
			}
				else if ((c == ' ' || c == '\n') && word == 1)
				{
					word = 0;
					ans[l++] = len;
				}
				else
				{
					len++;
				}
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",ans[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

