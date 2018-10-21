package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zifu = new char[2][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zifu[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zifu[1] = tempVar2.charAt(0);
		}
		int t;
		t = String.valueOf(zifu[0]).length();
		int k;
		k = String.valueOf(zifu[1]).length();
		if (t != k)
		{
			System.out.print("NO");

			return 0;
		}
		int i;
		int j;
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (zifu[0][i] == zifu[1][j])
				{
					zifu[0][i] = 0;
					zifu[1][j] = 0;
					break;

				}
				if (j == t - 1 && zifu[0][i] != zifu[1][j])
				{
					System.out.print("NO");

					return 0;

				}
			}
			if (i == t - 1)
			{
				System.out.print("YES");
			}
		}




		return 0;

	}

}

