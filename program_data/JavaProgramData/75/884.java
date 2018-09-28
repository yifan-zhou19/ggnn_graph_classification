package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[1002][3];
	   int[][] d = new int[2010][3];
	   int i = 1;
	   int j = 1;
	   int count = 0;
	   int tem = 0;
	   int max = 0;
	   char b;
	   for (i = 1;;i++)
	   {
		  a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  cin.get(b);
		  count++;
		  if (b == '\n')
		  {
		  break;
		  }
	   }
	   for (j = 1;;j++)
	   {
		  a[j][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  cin.get(b);
		  if (b == '\n')
		  {
		  break;
		  }
	   }
	   for (i = 1;i <= count;i++)
	   {
		  for (j = 1;j <= 2;j++)
		  {
			 d[i][j] = a[i][j];
		  }
	   }
	   for (i = 1;i <= count - 1;i++)
	   {
		  for (j = 1;j <= count - i;j++)
		  {
			 if (d[j][1] > d[j + 1][1])
			 {
				tem = d[j][1];
				d[j][1] = d[j + 1][1];
				d[j + 1][1] = tem;
			 }
			 if (d[j][2] > d[j + 1][2])
			 {
				tem = d[j][2];
				d[j][2] = d[j + 1][2];
				d[j + 1][2] = tem;
			 }
		  }
	   }
		  double k = 0.0;
		  for (k = d[1][1];k <= d[count][2];k += 0.5)
		  {
			 int num = 0;
			 for (j = 1;j <= count;j++)
			 {
				if (a[j][1] <= k != 0 && k < a[j][2])
				{
				num++;
				}
			 }
			 if (num > max)
			 {
			  max = num;
			 }
		  }
		  System.out.print(count);
		  System.out.print(" ");
		  System.out.print(max);
		  return 0;
	}

}

