package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sentence = new char[1000][20];
		int i = 0;
		int i0;
		while ((sentence[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
				i++;
		}
		i0 = i - 1;
		for (i = 0; i < i0; i++)
		{
			System.out.print(sentence[i]);
			System.out.print(" ");
		}
		System.out.print(sentence[i]);

	return 0;
	}
}

