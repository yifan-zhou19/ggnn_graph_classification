package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		char[][] words = new char[100][100];
		char temp;
		do
		{
			 words[n] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 n++;
			 temp = System.in.read();
		}while (temp != '\n');
		for (int i = 1;i <= n - 1;++i)
		{
			System.out.print(words[n - i]);
			System.out.print(" ");
		}
		System.out.print(words[0]);
		System.out.print("\n");
		return 0;
	}

}

