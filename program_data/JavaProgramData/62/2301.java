package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int n;
		for (int i = 0; i < 100; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			char q = System.in.read();
			if (q == '\n')
			{ //????????
				n = i + 1;
				break;
			}
		}
		System.out.print(a[0]);
		for (int k = 1; k < n; k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		}
		return 0;
	}
}

