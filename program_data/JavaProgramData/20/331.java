package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] str = new char[10000][100];
	 char[][] substr = new char[10000][100];
	 char max;
	 int i;
	 int j;
	 int k;
	 int n = 0;
	 int p;
	 i = 0;
	  while (scanf("%s", str[i]) != EOF)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 substr[i] = tempVar.charAt(0);
		 }
	   max = str[i][0];
	   p = 0;
	   for (j = 1;j <= String.valueOf(str[i]).length() - 1;j++)
	   {
		if (str[i][j] > max)
		{
		  max = str[i][j];
		  p = j;
		}
	   }
		for (k = String.valueOf(str[i]).length();k >= p + 1;k--)
		{
		 str[i][k + 3] = str[i][k];
		}
		for (k = p + 1;k <= p + 3;k++)
		{
		 str[i][k] = substr[i][k - p - 1];
		}
		 i++;
	  }
	  for (j = 0;j <= i - 1;j++)
	  {
		System.out.println(str[j]);
		System.out.print("\n");
	  }
	}


}

