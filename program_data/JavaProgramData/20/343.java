package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[10][14];
		char[][] substr = new char[10][4];
		char[][] a = new char[10][9];
		int p = 0;
		int i = 0;
		int q;
		int[] n = new int[10];
	/*	scanf("%s",str[p]);
		scanf("%s",substr[p]);*/
		while (scanf("%s%s",str[p],substr[p]) != EOF)
		{
		  int j = 0;
		  int max;
		  int m;
		  int k = 0;
		  n[p] = String.valueOf(str[p]).length();
		  max = str[p][0];
		  for (i = 0;i < n[p];i++)
		  {
		  if (str[p][i] > max)
		  {
		  max = str[p][i];
		  j = i;
		  }
		  }
		  m = j;
		  for (j = m;j < n[p] - 1;j++)
		  {
			a[p][k] = str[p][j + 1];
			k++;
		  }
		  str[p][m + 1] = substr[p][0];
		  str[p][m + 2] = substr[p][1];
		  str[p][m + 3] = substr[p][2];
		  k = 0;
		  for (j = m + 4;j < n[p] + 3;j++)
		  {
			  str[p][j] = a[p][k];
			  k++;
		  }
		  p++;
		 /* scanf("%s",str[p]);
		  scanf("%s",substr[p]);*/
		}
		for (q = 0;q < p - 1;q++)
		{
			for (i = 0;i < n[q] + 3;i++)
			{
				System.out.printf("%c",str[q][i]);
			}
		System.out.print("\n");
		}
		for (i = 0;i < n[p - 1] + 3;i++)
		{
			System.out.printf("%c",str[p - 1][i]);
		}
	}
}
