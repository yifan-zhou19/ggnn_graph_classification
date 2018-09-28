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
		int i;
		int j;
		int k;
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (k = 0;k < (hang + lie-1);k++)
		{
			if (k < lie)
			{
				for (i = 0;i < hang && (k - i)>-1;i++)
				{
				System.out.print((*(a + i) + k - i));
				System.out.print("\n");
				}
			}
			else
			{
				for (i = (k - lie+1);i < hang && (k - i)>-1;i++)
				{
				System.out.print((*(a + i) + k - i));
				System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

