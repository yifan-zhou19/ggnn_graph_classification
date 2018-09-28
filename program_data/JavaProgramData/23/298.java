package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][50];
		int i = 1;
		int j;
		while ((a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			i++;
		}
		for (j = i - 1;j >= 1;j--)
		{
			if (j == 1)
			{
				System.out.print(a[j]);
				break;
			}
			System.out.print(a[j]);
			System.out.print(" ");
		}
		return 0;
	}


}

