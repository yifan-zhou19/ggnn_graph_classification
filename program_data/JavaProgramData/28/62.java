package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] string = new char[300][20];
	  int i;
	  int j = 0;
	  int k;
	  int[] l = new int[300];
	  int n = 0;
	  while ((scanf("%s ",string[n])) != EOF)
	  {
		  n++;
	  }
	  for (i = 0;i < n;i++)
	  {
		  l[i] = String.valueOf(String[i]).length();
	  }
	  for (k = 0;k < n - 1;k++)
	  {
		 System.out.printf("%d,",l[k]);
	  }
	  System.out.printf("%d",l[n - 1]);
	}
}
