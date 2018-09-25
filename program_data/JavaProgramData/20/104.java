package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String[] str = {"\0"};
	 String[] substr = {"\0"};
	 String[] a = {"\0"};
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int m = 0;
	 for (i = 0;i < 100;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str[i] = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  substr[i] = tempVar2.charAt(0);
	  }
	  if (str[i][0] == '\0')
	  {
		  break;
	  }
	  m = String.valueOf(str[i]).length();
	  for (j = 0;j < m;j++)
	  {
	   if (str[i][j + 1] > str[i][k])
	   {
		k = j + 1;
	   }
	  }
	  for (j = 0;j <= k;j++)
	  {
	   a[i][j] = str[i][j];
	  }
	  a[i][k + 1] = substr[i][0];
	  a[i][k + 2] = substr[i][1];
	  a[i][k + 3] = substr[i][2];
	  m = String.valueOf(str[i]).length();
	  for (j = k + 1;j < m;j++)
	  {
	   a[i][j + 3] = str[i][j];
	  }
	 }
	 for (k = 0;k < i;k++)
	 {
	  System.out.printf("%s\n",a[k]);
	 }
	}

}

