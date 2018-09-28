package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[100][50];
		int i = 0;
		char c = '\0';
		words[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = System.in.read();
		while (c != '\n')
		{ // input part
			i++;
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			c = System.in.read();
		}
		for (int j = i; j > 0; j--) // output in the opposite order
		{
			System.out.print(words[j]);
			System.out.print(' ');
		}
		System.out.print(words[0]);
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

