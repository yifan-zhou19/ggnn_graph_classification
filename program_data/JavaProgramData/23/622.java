package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][10];
		int i;
		int s = 0;
		for (i = 0;;i++)
		{
				a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				s += 1;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
	System.out.print(a[s - 1]);
		for (i = s - 2;i >= 0;i--)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

