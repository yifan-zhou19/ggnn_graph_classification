package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[200]);
		int i;
		int count = 0;
		int mod = 0;
		int[] div = new int[200];
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; num.charAt(i) != '\0'; i++)
		{
			count++;
			div[i] = (num.charAt(i) - 48 + mod) / 13;
			mod = (num.charAt(i) - 48 + mod) % 13;
			mod *= 10;
		}
		for (i = 0; i < count; i++)
		{
			if (div[i] != 0)
			{
				for (int j = i; j < count; j++)
				{
					System.out.print(div[j]);
				}
				System.out.print("\n");
				System.out.print(mod / 10);
				System.out.print("\n");
				return 0;
			}
			if (i == count - 1)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(mod / 10);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

