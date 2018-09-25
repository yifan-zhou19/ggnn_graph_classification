package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 80;
		int i;
		int n;
		int len;
		int end = 0; // ?????????????
		String word = new String(new char[80]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			len = word.length();
			/* ?????????????????????
			   ???80????????? */
			if (end + len + 1 > 80)
			{
				System.out.print("\n");
				end = 0;
			}
			else
			{
				/* ?????????????????? */
				if (i > 0)
				{
					System.out.print(" ");
					end++;
				}
			}
			System.out.printf("%s", word);
			end += len;
		}
		return 0;
	}
}

