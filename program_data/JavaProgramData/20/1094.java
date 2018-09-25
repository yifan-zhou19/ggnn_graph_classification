package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[1000][10];
		char[][] substr = new char[1000][3];
		char max;
		char[][] s = new char[1000][100];
		int i = 0;
		int j;
		int k;
		int l;
		int q;
		int w;
		int e;
		while (scanf("%s %s",str[i],substr[i]) != EOF)
		{
			max = str[i][0];
			for (j = 1;j <= 10;j++)
			{
				if (max < str[i][j])
				{
					max = str[i][j];
				}
			}
			for (k = 0;k <= 10;k++)
			{
				if (str[i][k] == max)
				{
				  for (l = 0;l <= k;l++)
				  {
					  s[i][l] = str[i][l];
				  }
				  for (q = 0;l <= k + String.valueOf(substr[i]).length();l++,q++)
				  {
					  s[i][l] = substr[i][q];
				  }
				  for (w = k + 1;l <= String.valueOf(substr[i]).length() + String.valueOf(str[i]).length();l++,w++)
				  {
					  s[i][l] = str[i][w];
				  }
				  System.out.printf("%s\n",s[i]);
				  break;
				}
			}
		   i++;
		}
	}
}
