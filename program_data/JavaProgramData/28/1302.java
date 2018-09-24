package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int i = 0;
		int j;
		int k;
		int conuter = 0;
		int[] length = new int[300];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				ch = tempVar.charAt(0);
			}
			if (ch == '\n')
			{
				length[i] = conuter;
				break;
			}
			else
			{
				if (ch == ' ')
				{
					length[i] = conuter;
					conuter = 0;
					if (length[i] != 0)
					{
						i++;
					}
				}
				else
				{
					conuter++;
				}
			}
		}
		for (j = 0; j < i; j++)
		{
			System.out.printf("%d,", length[j]);
		}
		System.out.printf("%d", length[j]);
		return 0;
	}
}

