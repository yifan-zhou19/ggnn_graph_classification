package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[][] s = new int[2][50000];
	  int k;
	  int i;
	  int tmp;
	  int tmp2;
	  int d = 1;

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
			s[0][i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s[1][i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (k = 1;k < n;k++)
	  {
		for (i = 0;i < n - k;i++)
		{
		  if (s[0][i] > s[0][i + 1])
		  {
				tmp = s[0][i];
			s[0][i] = s[0][i + 1];
			s[0][i + 1] = tmp;
			tmp2 = s[1][i];
			s[1][i] = s[1][i + 1];
			s[1][i + 1] = tmp2;
		  }
		}
	  }

	  for (i = 0;i < n;i++)
	  {
	   if (s[1][i] < s[0][i + 1])
	   {
		 d = 0;
		 break;
	   }
	   else
	   {
		 if ((s[1][i] > s[1][i + 1]) && (i != n - 1))
		 {
		   tmp = s[1][i];
		   s[1][i] = s[1][i + 1];
		   s[1][i + 1] = tmp;
		 }

	   }
	  }
	  if (d == 0)
	  {
		  System.out.print("no");
	  }
	  else
	  {
		  System.out.printf("%d %d",s[0][0],s[1][n - 1]);
	  }
	  return 0;
	}
}

