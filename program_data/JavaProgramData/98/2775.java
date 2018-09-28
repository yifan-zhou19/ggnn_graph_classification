package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int len;
		char[][] word = new char[1000][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		len = 0;
		i = 0;
		while (i < num)
		{
			while (len + String.valueOf(word[i]).length() <= 80)
			{
				len = len + String.valueOf(word[i]).length();
				System.out.print(word[i]);
				if (i + 1 >= num)
				{
					i++;
					break;
				}
				if (len + String.valueOf(word[i + 1]).length() < 80)
				{
					System.out.print(" ");
				}
				len = len + 1;
				i++;
			}
			System.out.print("\n");
			len = 0;
		}
	}
}

