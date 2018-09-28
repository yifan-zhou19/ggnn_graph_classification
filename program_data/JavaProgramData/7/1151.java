package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j = 0;
	  int k;
	  int t = 0;
	  int l;
	  int p;
	  int h;
	  int n;
	  int m;
	  char[][] str = new char[3][600];
	  for (i = 0;i < 3;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str[i] = tempVar.charAt(0);
		}
	  }
	  m = String.valueOf(str[1]).length();
	  n = String.valueOf(str[0]).length();
	  p = String.valueOf(str[2]).length();
	  for (i = 0;i < n - m + 1,j < m;i++)
	  {
		 if (str[0][i] == str[1][j])
		 {
			 t++;
			 j++;
		 }
		 else
		 {
			 j = 0;
			 t = 0;
		 }
		 if (t == m)
		 {
		   break;
		 }
	  }
	  if (t != m)
	  {
		System.out.printf("%s",str[0]);
	  }
	  else
	  {
		  for (l = i - m + 1,h = 0;h < p;h++,l++)
		  {
			str[0][l] = str[2][h];
		  }
		  System.out.printf("%s",str[0]);
	  }
	  return 0;
	}



}

