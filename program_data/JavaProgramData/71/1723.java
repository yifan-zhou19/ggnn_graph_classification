package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????????????a???????b
		int d;
		int[][] a = new int[200][3];
		int i;
		int j;
		int r;
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++) //?????????
	{
		for (j = 1;j <= 3;j++)
		{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (i = 1;i <= n;i++) //?????????????
	{
			if (a[i][2] > a[i][3])
			{
			   k = a[i][2];
			   a[i][2] = a[i][3];
			   a[i][3] = k;
			}
	}
	for (i = 1;i <= n;i++) //?????????
	{
		 d = 0;
		 for (r = a[i][2] - 1;r < a[i][3] - 1;r++)
		 {
			 d = d + b[r];
		 } //??????????
	  if ((a[i][2]) <= 2 && (a[i][3] >= 3) && ((a[i][1] % 4 == 0 && a[i][1] % 100 != 0) || (a[i][1] % 400 == 0))) //????
	  {
		  d = d + 1;
	  }
	if (d % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	return 0;
	}
}

