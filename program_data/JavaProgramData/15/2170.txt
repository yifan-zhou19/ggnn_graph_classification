package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int first;
		  int num;
		  int fstn;
		  int counter1 = 0;
		  int counter2 = 0;
		  int sum = 0;
		  int[][] c = new int[100][100];
		  int[] s = new int[100];
		  int[] t = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  c[i][j] = Integer.parseInt(tempVar2);
				  }
			  }
		  }
		   for (i = 0;i < n;i++)
		   {
			  int tum1 = 0;
			  sum = 0;
			  for (j = 0;j < n;j++)
			  {
				sum += c[i][j];
			  }
			  tum1 = n - sum / 255;
			  s[i] = tum1;

		   }


		  for (i = 0;i < n;i++)
		  {
			  if (s[i] != 0)
			  {
				  first = i + 1;
				  fstn = s[i];
				  break;
			  }
		  }
		  for (i = first;s[i] != fstn;i++)
		  {
			   counter1++;
		  }
		  for (j = 0;j < n;j++)
		  {
			   int tum2;
			   sum = 0;
			   for (i = 0;i < n;i++)
			   {
				   sum += c[i][j];
			   }
			   tum2 = n - sum / 255;
			   t[j] = tum2;
		  }
		  for (j = 0;j < n;j++)
		  {
			  if (t[j] != 0)
			  {
				  first = j + 1;
				  fstn = t[j];
				  break;
			  }
		  }
		  for (j = first;t[j] != fstn;j++)
		  {
			   counter2++;
		  }




		  System.out.printf("%d",counter1 * counter2);
	}



}

