package <missing>;

public class GlobalMembers
{
	//****************************
	//**????
	//****************************
	public static int Main()
	{
		char[][] str = new char[100][100];
		int n = 0;
		str[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (System.in.read() != '\n') //????????????????
		{
			str[n + 1] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			n++;

		}
		int k = n;
		for (k = n;k > 0;k--)
		{
			System.out.print(str[k]);
			System.out.print(" ");
		}
		System.out.print(str[0]);
		System.out.print("\n");
		return 0;
	}

}

