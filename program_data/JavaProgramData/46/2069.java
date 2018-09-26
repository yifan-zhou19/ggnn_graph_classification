package <missing>;

public class GlobalMembers
{
	/*????????
	 ?????
	 ??????
	 ???????????????*/


	public static int Main()
	{
		int hang;
		int lie;
		hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 1;i <= hang;i++)
		{
			for (j = 1;j <= lie;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int sum = 0;
		int quan = 1;

		while (sum < hang * lie)
		{
			for (i = quan;i <= lie - quan + 1;i++)
			{
				System.out.print(a[quan][i]);
				System.out.print("\n");
				sum++;
			}
			if (sum == hang * lie)
			{
				break; //????????????????????????
			}
			for (i = quan + 1;i <= hang - quan + 1;i++)
			{
				System.out.print(a[i][lie - quan + 1]);
				System.out.print("\n");
				sum++;
			}
			if (sum == hang * lie)
			{
				break;
			}
			for (i = lie - quan;i >= quan;i--)
			{
				System.out.print(a[hang - quan + 1][i]);
				System.out.print("\n");
				sum++;
			}
			if (sum == hang * lie)
			{
				break;
			}
			for (i = hang - quan;i >= quan + 1;i--)
			{
				System.out.print(a[i][quan]);
				System.out.print("\n");
				sum++;
			}
			if (sum == hang * lie)
			{
				break;
			}
			quan++;
		}

		return 0;
	}
}

