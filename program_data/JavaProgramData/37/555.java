package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int len;
		int judge;
		String string = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			for (i = 0;i < 10000;i++)
			{
				String[i] = '\0';
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				string = tempVar2.charAt(0);
			}
			len = String.length();
			for (i = 0;i < len;i++)
			{
				judge = 0;
				for (j = i + 1;j < len;j++)
				{
					if (String[i] == string.charAt(j))
					{
						String[j] = 'A';
						judge = 1;
					}
				}
				if (judge != 0)
				{
					String[i] = 'A';
				}
			}
			for (i = 0;i < len;i++)
			{
				if (String[i] != 'A')
				{
					System.out.printf("%c\n",string.charAt(i));
					break;
				}
				else if (i == len - 1)
				{
					System.out.print("no\n");
					break;
				}
			}
		}
	}
}

