package <missing>;

public class GlobalMembers
{
	/*
	 * ??.cpp
	 * ??:???
	 * ????: 2011-11-4
	 * ??:???????
	 */

	public static int Main()
	{
	int[][] a = new int[5][5]; //????
	int i;
	int j;
	int t;
	int s;
	s = 0;
	for (i = 0;i < 5;i++) //??????
	{
	for (j = 0;j < 5;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
		for (i = 0;i < 5;i++) //????
		{
	for (j = 0;j < 5;j++)
	{
	t = a[i][j];
		if ((t >= a[i][0]) && (t >= a[i][1]) && (t >= a[i][2]) && (t >= a[i][3]) && (t >= a[i][4]) && (t <= a[0][j]) && (t <= a[1][j]) && (t <= a[2][j]) && (t <= a[3][j]) && (t <= a[4][j]))
		{
		 System.out.print(i + 1);
		 System.out.print(" ");
		 System.out.print(j + 1);
		 System.out.print(" ");
		 System.out.print(t);
		 System.out.print("\n");
		 s++;
		 break;
		}
	}
		}
	if (s == 0)
	{
	System.out.print("not found");
	System.out.print("\n");
	}
		return 0; //????
	}
}

