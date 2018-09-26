package <missing>;

public class GlobalMembers
{
	public static int second(int a, int b, int c, int d, int e, int f)
	{
	  int i;
	  int sum;
	  d = d + 12;
	  sum = (d - a) * 3600 + (e - b) * 60 + f - c;
	  return sum;
	}

	public static int Main()
	{
	  int[][] a = new int[1000][6];
	  int i;
	  int j = 0;
	  int m = 0;
	  do
	  {
		for (i = 0; i < 6; i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[j][i] = Integer.parseInt(tempVar);
		  }
		  if (a[j][i] == 0)
		  {
			  m++;
		  }
		}
		j++;
	  } while (m < 6);

	  for (i = 0; i < j - 1; i++)
	  {
		System.out.printf("%d\n", second(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4], a[i][5]));
	  }

	  return 0;
	}
}

