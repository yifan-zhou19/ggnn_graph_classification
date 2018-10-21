package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int i;
		int num;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[1000][40];
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}
		i = 0;
		for (t = 0;i < n - 1;t++)
		{ //???
			System.out.print(word[i]);
			for (num = 1 + String.valueOf(word[i]).length();i < n - 1;)
			{
				num = num + String.valueOf(word[i + 1]).length() + 1;
				if (num <= 81)
				{ //??????
					System.out.print(" ");
					System.out.print(word[i + 1]);
					i++;
				}
				else
				{
					System.out.print("\n");
					i++;
					break;
				}
			}
		}
		return 0; //????
	}
}

