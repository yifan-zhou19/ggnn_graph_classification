package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int[][] a = new int[100][100];
		hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < hang; i++)
		{
			for (int j = 0; j < lie; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int k = 0; k < lie; k++) //????????k?????
		{
			for (int l = k; (l >= 0) && (k - l < hang); l--) // ?????????????,??????k+1???????????
			{
				System.out.print(a[k - l][l]);
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		for (int p = lie; p < hang + lie - 1; p++) //????????p?????
		{
			for (int q = lie - 1;(q >= 0) && (p - q < hang);q--)
			{
				System.out.print(a[p - q][q]);
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

