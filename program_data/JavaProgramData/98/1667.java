package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			char[][] word = new char[n][41];
			String[] p = new String[n]; //????????,?????
			for (int i = 0;i < n;i++)
			{
				word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				p[i] = word[i];
			}
			for (int i = 0;i < n;i++)
			{
				t += String.valueOf(word[i]).length() + 1;
				if (t + String.valueOf(word[i + 1]).length() <= 80)
				{
					if (i == n - 1)
					{
						System.out.print(p[i]);
						break;
					}
					System.out.print(p[i]);
					System.out.print(" ");
				}
				if (t + String.valueOf(word[i + 1]).length() > 80)
				{
					System.out.print(p[i]);
					System.out.print("\n");
					t = 0;
				}
			}

		return 0;
	}

}

