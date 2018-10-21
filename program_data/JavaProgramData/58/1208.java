package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[81]);
		int n;
		int i;
		int j;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			flag = 0;
			String = new Scanner(System.in).nextLine();
			char x = string.charAt(0);
			if ((x < 65) || (x>90 && x < 95) || (x == 96) || (x>122))
			{
					flag = 1;
			}
			for (j = 1;string.charAt(j) != '\0';j++)
			{
				x = string.charAt(j);
				if ((x < 48) || (x>57 && x < 65) || (x>90 && x < 95) || (x == 96) || (x>122))
				{
						flag = 1;
						break;
				}
			}
			if (i != 1)
			{
				System.out.print("\n");
			}
			if (flag == 1)
			{
				System.out.print(0);
			}
			else
			{
				System.out.print(1);
			}
		}
		return 0;
	}
}

