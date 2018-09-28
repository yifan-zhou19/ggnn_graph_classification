package <missing>;

public class GlobalMembers
{
	/*
	hw.cpp
	????yang?
	???????
	???10.28
	*/
	public static int Main()
	{
		int[][] a = new int[6][6]; //????????????s[]??n[]????h??l
		int[] s = {1, 1, 1, 1, 1, 1};
		int[] n = {1, 1, 1, 1, 1, 1};
		int h = 0;
		int l = 0;
		for (int i = 1;i <= 5;i++)
		{
			for (int j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} //????
		for (int i = 1;i <= 5;i++)
		{
			for (int j = 1;j <= 5;j++)
			{
				if (a[i][j] > a[i][s[i]])
				{
					s[i] = j;
				}
				if (a[n[j]][j] > a[i][j])
				{
					n[j] = i;
				}
			}
		} //?????????????
		for (int i = 1;i <= 5;i++)
		{
			if (s[n[i]] == i) //????
			{
				h = n[i];
				l = i;
			break;
			}
		} //????
		if (h * l == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		else
		{
			System.out.print(h);
			System.out.print(" ");
			System.out.print(l);
			System.out.print(" ");
			System.out.print(a[h][l]);
			System.out.print("\n");
		}
		return 0;
	}
}

