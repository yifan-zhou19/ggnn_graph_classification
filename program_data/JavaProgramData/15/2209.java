package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int[] is1 = new int[4000];
		int[] is2 = new int[4000];
		int s;
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int i = 0; i < n;i++)
	   {
			 for (int j = 0; j < n;j++)
			 {
				 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 if (a[i][j] == 0)
				 {

							 is1[k] = i;
							 is2[k++] = j;
				 }
			 }
	   }
		System.out.print((is1[k - 1] - is1[0] - 1) * (is2[k - 1] - is2[0] - 1));
		return 0;
	}
}

