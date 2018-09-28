package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[50][100];
	int[] d = new int[100];
	int i;
	int j;
	int a = 0;
	 for (i = 0;i < 50;i++)
	 {
		 d[i] = 0;
	 for (j = 0;j < 100;j++)
	 {
			c[i][j] = System.in.read();
		if (c[i][j] > 122 || c[i][j] < 50)
		{
			break;
		}
		d[i] += 1;
	 }
		if (c[i][j] == '\n')
		{
			break;
		}
		a += 1;
	 }
	 for (j = 0;j < d[a];j++)
	 {
		 System.out.print(c[a][j]);
	 }
	 for (i = a - 1;i >= 0;i--)
	 {
		 System.out.print(" ");
	 for (j = 0;j < d[i];j++)
	 {
			System.out.print(c[i][j]);
	 }
	 }
	}
}
