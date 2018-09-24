package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[10000][100];
		str[0] = new Scanner(System.in).nextLine();
		int i = 0;
		int j;
		while (str[i][0] != 'e')
		{
							 i++;
							 str[i] = new Scanner(System.in).nextLine();
		}
		for (j = i - 1;j >= 0;j--)
		{
		System.out.printf("%s\n",str[j]);
		}
		System.in.read();
		System.in.read();
	}

}
