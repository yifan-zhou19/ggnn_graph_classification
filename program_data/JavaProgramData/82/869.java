package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count;
		int max = 0;
		int i = 0;
		while (i < n)
		{
			count = 0;
			int h;
			int l;
			for (int j = i;j < n;j++)
			{
				h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((h > 140 || h < 90) || (l>90 || l < 60))
				{
					i++;
					break;
				}
				else
				{
					count++;
					if (count > max)
					{
						max = count;
					}
					i++;
				}
			}
		}
		System.out.print(max);
		return 0;
	}
}

