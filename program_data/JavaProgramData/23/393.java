package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		char[][] a = new char[50][50];
		int i = 0;
		int j;
		while ((a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i++;
		}
		for (j = i - 1;j > 0;j--)
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
		return 0;
	}


}

