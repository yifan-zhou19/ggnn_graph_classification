package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int t;
	  int n;
	  int sum;
	  int i;
	  int[][] ru = new int[M][2];
	  int[] m = new int[M];
	  sum = 0;
	  t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ru[i][1] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  ru[i][2] = Integer.parseInt(tempVar3);
		  }

		  if (ru[i][1] > 89 && ru[i][1] < 141 && ru[i][2]>59 && ru[i][2] < 91)
		  {
			  sum++;
			  m[i] = sum;
		  }
		  else
		  {
			  m[i] = sum;
			  sum = 0;
		  }
	  }

	  for (i = 0;i < n;i++)
	  {
		  if (m[i] > t)
		  {
			  t = m[i];
		  }
	  }

	  System.out.printf("%d",t);


	return 0;
	}

}

