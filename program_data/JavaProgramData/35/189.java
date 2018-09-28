package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[][] a = new int[8][8];
	  int h;
	  int l;
	  int i;
	  int j;
	  int k;
	  int temp;
	  int count;
	  int hh;
	  int ll;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  h = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  l = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i <= h - 1;i++)
	  {
		   for (j = 0;j <= l - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	  }
	  for (i = 0;i <= h - 1;i++)
	  {
		  temp = a[i][0];
		  count = 0;
		  for (k = 1;k <= l - 1;k++)
		  {
			  temp = temp > a[i][k] != 0?temp:a[i][k];
		  }
		  for (j = 0;j <= l - 1;j++)
		  {
			  if (temp == a[i][j])
			  {
				  ll = j;
				  break;
			  }
		  }
		  for (k = 0;k <= h - 1;k++)
		  {
			  if (a[i][ll] > a[k][ll])
			  {
				  break;
			  }
			else
			{
				count++;
			}
		  }
		  if (count == h)
		  {
			  hh = i;
			  break;
		  }
	  }
	  if (count != h)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  System.out.printf("%d+%d",hh,ll);
	  }
	}

}

