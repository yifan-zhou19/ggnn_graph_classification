package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[400]);
	  char[][] num1 = new char[400][400];
	  int[] sum = new int[400];
	  int i;
	  int n;
	  int j;
	  int t;
	  int m;
	  int s;
	  int max;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  num = new Scanner(System.in).nextLine();
	  m = num.length();
	  for (i = 0;i < 400;i++)
	  {
		  sum[i] = 1;
	  }
	  for (i = 0;i <= m - n;i++)
	  {
		  for (j = i;j < i + n;j++)
		  {
			  num1[i][j - i] = num.charAt(j);
		  }
	  }
	  for (i = 0;i <= m - n;i++)
	  {
		  t = 0;
		 if (sum[i] != 0)
		 {
			 for (j = 0;j <= m - n;j++)
			 {
			 for (s = j;s < j + n;s++)
			 {
			  if (num.charAt(s) != num1[i][s - j])
			  {
				  break;
			  }
			 }
			  if (s == j + n)
			  {
				  t++;
				  sum[j] = 0;
			  }
			 }
		 sum[i] = t;
		 }
	  }
	  max = 1;
	  for (i = 0;i <= m - n;i++)
	  {
		  if (sum[i] > max)
		  {
			  max = sum[i];
		  }
	  }
	  if (max != 1)
	  {
		  System.out.printf("%d\n",max);
		  for (i = 0;i < m - n;i++)
		  {
		 if (sum[i] == max)
		 {
			 for (j = 0;j < n;j++)
			 {
		   System.out.printf("%c",num1[i][j]);
			 }
		   System.out.print("\n");
		 }
		  }
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	return 0;
	}

}

