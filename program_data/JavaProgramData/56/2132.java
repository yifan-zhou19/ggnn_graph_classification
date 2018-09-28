package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int s = 0;
	  int i;
	  int j;
	  int h;
	  int n;
	  int[] u = new int[10];
	  int t;
	  int[] v = new int[10];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= 6;i++)
	  {
		  h = 1;
	 for (j = 1;j <= i;j++)
	 {
		 h *= 10;
	 }
	 if (n / h == 0)
	 {
	  break;
	 }
	  }

	  for (j = i - 1;j >= 0;j--)
	  {
		u[i] = n;
		v[i] = 0;
		u[j] = u[j + 1] - v[j + 1] * Math.pow(10,j + 1);
		v[j] = u[j] / Math.pow(10,j);

	  }
	  for (j = 0;j <= i - 1;j++)
	  {
	s += v[j] * Math.pow(10,i - 1 - j);
	  }
	System.out.printf("%d",s);



	  return 0;
	}




}

