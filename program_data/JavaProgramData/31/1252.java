package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n = 0;
		char[][] a = new char[500][100];
		for (i = 0; i < 500; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			//getchar();
			if (a[i][0] == 'e')
			{
				break;
			}
		}
		n = i - 1;
		for (i = n; i >= 0; i--)
		{
			System.out.printf("%s\n",a[i]);
		}
	}
}
