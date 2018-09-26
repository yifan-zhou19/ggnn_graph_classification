package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		char[][] a = new char[100][100];
		int n; //???????
		int i;
		int j;
		int[] l = new int[100];
		int check = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine(); //??
		}
			for (i = 0;i < n;i++)
			{
				l[i] = String.valueOf(a[i]).length();
			}

		for (i = 0;i < n;i++)
		{
			for (j = 1;j < l[i];j++)
			{
				  if (a[i][j] != 95 && (a[i][j] < '0' || (a[i][j]>'9' && a[i][j] < 'A') || (a[i][j]>'Z' && a[i][j] < 'a') || a[i][j]>'z')) //????
				  {
			check = 0;
			break;
				  }
			}

			if ((a[i][0] == '_' || (a[i][0] >= 'A' && a[i][0] <= 'z')) && check == 1) //????
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
				check = 1;
			}
		}
		return 0;

	}

}

