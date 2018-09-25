package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]);
		int k = -1;
		num = tangible.StringFunctions.changeCharacter(num, 0, ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; num.charAt(i - 1) != '\n';i++, k++)
		{
			cin.get(num.charAt(i));
		}
		for (; k >= 0; k--)
		{
			System.out.print(num.charAt(k));
		}
		System.out.print("\n");
		//while (1);return 0;

	}
}

