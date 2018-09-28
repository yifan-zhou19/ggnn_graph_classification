package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n????????
		int[] shun = new int[100];
		int[] ni = new int[100]; //shun?????,ni?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //??????????
		{
			shun[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++) //????????????????
		{
			ni[j] = shun[n - 1 - j];
		}
		System.out.print(ni[0]);
		for (int k = 1;k < n;k++)
		{
			System.out.print(' ');
			System.out.print(ni[k]);
		}
		return 0;
	}
}

