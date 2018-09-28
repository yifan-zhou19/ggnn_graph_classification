package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][20];
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int d;
		int[] b = new int[50];
		char c;
		for (c = System.in.read();c != '\n';c = System.in.read()) //?????????????
		{
			if (c != ' ')
			{
				a[i][j] = c;
				j++;
				d = j;
			}
			else
			{
				i++;
				m = i;
				b[k] = j;
				k++;
				j = 0;
			}
		}
		b[k] = j; //???????????????b?
		for (;m > 0;m--) //?b[m-1]?a[m-1]??m-1???m??????????
		{
			for (j = 0;j < b[m] - 1;j++)
			{
				System.out.printf("%c",a[m][j]);
			}
			System.out.printf("%c ",a[m][b[m] - 1]); //?b[i]-1??b[m]-1?????????????
		}
		for (j = 0;j < b[0];j++) //?j<d??j<b[0]?d????????j?
		{
				System.out.printf("%c",a[0][j]);
		}
		return 0;
	}
}
