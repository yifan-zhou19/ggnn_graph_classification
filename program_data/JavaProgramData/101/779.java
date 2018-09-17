package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'A', 'B', 'C'};
		int[] b = new int[3]; //b0,b1,b2????a,b,c????
		int[] c = new int[3];
		int i; //???
		int j;
		int k;
		for (i = 0;i < 3;i++)
		{
						b[i] = 0;
						b[(i + 1) % 3] = 1;
						b[(i + 2) % 3] = 2;
						c[0] = (b[1] > b[0]) + (b[2] == b[0]);
						c[1] = (b[0] > b[1]) + (b[0] > b[2]);
						c[2] = (b[2] > b[1]) + (b[1] > b[0]);
						if ((c[i] == 2) && (c[(i + 1) % 3] == 1) && (c[(i + 2) % 3] == 0))
						{
						System.out.print(a[i]);
						System.out.print(a[(i + 1) % 3]);
						System.out.print(a[(i + 2) % 3]);
						}
		}
		for (i = 0;i < 3;i++)
		{
						b[i] = 0;
						b[(i + 1) % 3] = 2;
						b[(i + 2) % 3] = 1;
						c[0] = (b[1] > b[0]) + (b[2] == b[0]);
						c[1] = (b[0] > b[1]) + (b[0] > b[2]);
						c[2] = (b[2] > b[1]) + (b[1] > b[0]);
						if ((c[i] == 2) && (c[(i + 1) % 3] == 1) && (c[(i + 2) % 3] == 0))
						{
						System.out.print(a[i]);
						System.out.print(a[(i + 1) % 3]);
						System.out.print(a[(i + 2) % 3]);
						}
		}
		return 0;
	}

}
