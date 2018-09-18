package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*?????? 1100012763              **
	//*???2011.11.14                     **
	//****************************************
	public static int Main()
	{
		int n;
		int number;
		int i;
		int j;
		int k;
		int t;
		int len;
		int max;
		int[][] map = new int[26][1000];
		String name = new String(new char[27]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= 25; i++)
		{
			map[i][0] = 0;
		}
		for (i = 1; i <= n; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			name = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = name.length();
			for (j = 0; j <= len - 1; j++)
			{
				k = name.charAt(j) - 'A';
				map[k][0]++;
				t = map[k][0];
				map[k][t] = number;
			}
		}
		max = 0;
		for (i = 0; i <= 25; i++)
		{
			if (map[i][0] > max)
			{
				max = map[i][0];
				k = i;
			}
		}
		System.out.print((char)(65 + k));
		System.out.print("\n");
		System.out.print(map[k][0]);
		for (i = 1; i <= map[k][0]; i++)
		{
			System.out.print("\n");
			System.out.print(map[k][i]);
		}

		return 0;
	}
}

