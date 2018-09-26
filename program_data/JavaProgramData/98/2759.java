package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cnt;
		char[][] data = new char[1000][90];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cnt = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < cnt;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i] = tempVar2.charAt(0);
			}
		}
		int c = 0;
		i = 0;
		while (i < cnt)
		{
			while (c < 80)
			{
				if (c + String.valueOf(data[i]).length() >= 80)
				{
					break;
				}
				if (c != 0)
				{
					System.out.print(" ");
					c++;
				}
				System.out.printf("%s",data[i]);
				c = c + String.valueOf(data[i]).length();
				i++;
				if (i >= cnt)
				{
					break;
				}
			}
			System.out.print("\n");
			c = 0;
		}

		return 0;
	}
}

