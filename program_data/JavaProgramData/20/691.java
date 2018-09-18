package <missing>;

public class GlobalMembers
{
	public static int findmax(String a)
	{
	  int maxnum = 0;
	  int max;
	  max = a[0];
	  int i;
	  int len;
	  len = a.length();
	  int comp;
	  comp = a[0];
	  for (i = 0;i < len - 1;i++)
	  {
		  if (a[i + 1].compareTo(max) > 0)
		  {
			  maxnum = i + 1;
			  max = a[i + 1];
		  }
	  }
	  return maxnum;
	}

	public static void Main()
	{

	  int lstr;
	  int mnum;
	  int i;
	  char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	  char[] substr = {0, '\0', '\0', '\0', '\0'};
		while (scanf("%s %s",str,substr) != EOF)
		{

		  mnum = findmax(str);
		  lstr = str.length();
		  for (i = lstr - 1;i > mnum;i--)
		  {
			 str[i + 3] = str[i];
		  }
		  for (i = 0;i < 3;i++)
		  {
			  str[mnum + i + 1] = substr[i];
		  }
		  System.out.printf("%s\n",str);
		  for (i = 0;i < 15;i++)
		  {
			  str[i] = 0;
		  }
		  for (i = 0;i < 3;i++)
		  {
			  substr[i] = 0;
		  }
		}

	}


}
