package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		int flag;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int num = a.length();
		for (int i = 2; i <= num;i++) //????
		{
			for (int j = 0;j <= num - i + 1;j++) //???
			{
				flag = 0;
				for (int k = 0; k < i / 2;k++) //??????
				{
					if (a.charAt(j + k) != a.charAt(j + i - k - 1))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (int l = j; l <= j + i - 1;l++)
					{
						System.out.print(a.charAt(l));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

