package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = 0;
		int i;
		int j;
		int[] b = new int[1000];
		char[][] a = new char[1000][130];
		char c;
		c = System.in.read();
		while (c > 96 && c < 123 || c>64 && c < 91)
		{
				  while (c > 96 && c < 123 || c>64 && c < 91)
				  {
								a[count][b[count]] = c;
								b[count]++;
								c = System.in.read();
				  }
				  while (c == ' ')
				  {
					  c = System.in.read();
				  }
				  count++;
		} //??????,??????a
		for (i = count - 1;i > 0;i--)
		{
			for (j = 0;j < b[i];j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print(' ');
		}
		for (j = 0;j < b[0];j++)
		{
			System.out.print(a[0][j]);
		}
		return 0;
	}

}
