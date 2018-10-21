package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][105];
		int i = 0;
		while (true)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
			if (System.in.read() == '\n')
			{
			break; //?????????
			}
		}
		for (int j = i - 1;j > 0;j--) //??????
		{
			System.out.print(a[j]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
		return 0;
	}
}

