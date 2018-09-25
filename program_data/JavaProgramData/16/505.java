package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		int m;
		char[][] a = new char[1][5]; //????????
		cin.get(a[0],5); //???????
		n = String.valueOf(a[0]).length();
		for (i = 0,j = n - 1;i < j;i++,j--) //?????????
		{
			t = a[0][i];
			a[0][i] = a[0][j];
			a[0][j] = t;
		}
		for (m = 0;m < n;m++) //????????????
		{
			System.out.print(a[0][m]);
		}
		return 0;
	}
}
