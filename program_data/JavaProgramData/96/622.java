package <missing>;

public class GlobalMembers
{
	//**************************** 
	//*?????13              *
	//*????? 1200012708     *
	//*???2012?11?10?      *
	//**************************** 

	public static int Main()
	{
		char a; // ????
		int[] c = new int[200]; // c?????ans??
		int[] ans = new int[200];
		int l = 0; // l???????m??
		int s;
		int m;

		while (scanf("%c", a) && a != '\n') // ??????????????
		{
			c[l++] = a - '0';
		}
		m = 0;
		for (int i = 0; i < l; i++) // ??????
		{
			c[i] += m * 10;
			m = c[i] % 13;
			ans[i] = c[i] / 13;
		}
		for (s = 0; s < l; s++) // ????0?????
		{
			if (ans[s] != 0)
			{
				break;
			}
		}
		if (s == l)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else // ??????????
		{
			for (int i = s; i < l; i++)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		System.out.print(m);
		System.out.print("\n");

		return 0;
	}

}
