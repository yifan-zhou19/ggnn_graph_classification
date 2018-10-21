package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int lenS;
		int i;
		int[] answer = new int[100];
		int[] devided = new int[100];
		int left;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			lenS = str.length();
			if (lenS == 1)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(str.charAt(0));
				System.out.print("\n");
			}
			else if (lenS == 2 && str.charAt(0) == '1' && str.charAt(1) < '3')
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(str.charAt(0));
				System.out.print(str.charAt(1));
				System.out.print("\n");
			}
			else
			{
				for (i = 0; i < lenS; i++)
				{
					devided[i] = str.charAt(i) - '0';
				}
				if (str.charAt(0) == '1' && str.charAt(1) < '3')
				{
					answer[0] = (devided[0] * 100 + devided[1] * 10 + devided[2]) / 13;
					left = (devided[0] * 100 + devided[1] * 10 + devided[2]) % 13;
					System.out.print(answer[0]);
					for (i = 1; i < lenS - 2; i++)
					{
						answer[i] = (left * 10 + devided[i + 2]) / 13;
						left = (left * 10 + devided[i + 2]) % 13;
						System.out.print(answer[i]);
					}
					System.out.print("\n");
					System.out.printf("%d", "\n");
				}
				else
				{
					left = devided[0];
					for (i = 0; i < lenS - 1; i++)
					{
						answer[i] = (left * 10 + devided[i + 1]) / 13;
						left = (left * 10 + devided[i + 1]) % 13;
					}
					if (answer[0] != 0)
					{
						System.out.printf("%d", answer[0]);
					}
					for (i = 1; i < lenS - 1; i++)
					{
						System.out.printf("%d", answer[i]);
					}
					System.out.printf("%d", "\n");
					System.out.printf("%d", "\n");
				}
			}
		}
		return 0;
	}

}

