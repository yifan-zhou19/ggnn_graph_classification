package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] a = new char[100][11];
	  char[][] b = new char[100][4];
	  int p;
	  int i = 0;
	  int j;
	  int k;
	  int t;
	  while (scanf("%s%s",a[i],b[i]) != EOF)
	  {
		  i++;
	  }
	  for (j = 0;j < i;j++)
	  {
			t = 0;
		   for (k = 1;k < String.valueOf(a[j]).length();k++)
		   {
			   if (a[j][k] > a[j][t])
			   {
				   t = k;
			   }
		   }
		   for (p = 0;p <= t;p++)
		   {
			   System.out.printf("%c",a[j][p]);
		   }
		   for (p = 0;p < String.valueOf(b[j]).length();p++)
		   {
			   System.out.printf("%c",b[j][p]);
		   }
		   for (p = t + 1;p < String.valueOf(a[j]).length();p++)
		   {
			   System.out.printf("%c",a[j][p]);
		   }
		   System.out.print("\n");
	  }
	}

}
