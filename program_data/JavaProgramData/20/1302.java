package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int m;
	  int n;
	  for (;;)
	  {
		  String str = new String(new char[11]);
		  String substr = new String(new char[4]);
		  char[] combine = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		  if (scanf("%s%s",str,substr) == EOF)
		  {
			  break;
		  }
		  n = str.length();
		  m = 0;
		  for (i = 0;i < n;i++)
		  {
			  if (str.charAt(i) - str.charAt(m) > 0)
			  {
				  m = i;
			  }
		  }
		  for (i = 0;i <= m;i++)
		  {
			  combine[i] = str.charAt(i);
		  }
		  for (i = 1;i <= 3;i++)
		  {
			  combine[m + i] = substr.charAt(i - 1);
		  }
		  for (i = 1;i <= n - m - 1;i++)
		  {
			  combine[m + 3 + i] = str.charAt(m + i);
		  }
		  System.out.println(combine);
	  }
	}


}
