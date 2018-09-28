package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[5000]);
	public static char[][] word = new char[200][20];

	public static int checknum(int m)
	{
	   if ((s.charAt(m) != ' ' && s.charAt(m) != ',' && m < s.length()) && (s.charAt(m - 1) == ' ' || s.charAt(m - 1) == ',' || m - 1 < 0))
	   {
	   return 1;
	   }
	   else
	   {
		   return 0;
	   }
	}
	public static int findlen(int b)
	{
	  int i;
	  i = 0;
	  while (s.charAt(b + i) != ' ' && s.charAt(b + i) != ',' && (b + i) < s.length())
	  {
		  i++;
	  }
	  return i;
	}

	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int max;
	  int min;
	  int maxn;
	  int minn;
	  s = new Scanner(System.in).nextLine();
	  k = 0;
	  i = 0;
	  max = 0;
	  min = 20;
	  while (i < s.length())
	  {
		if (checknum(i) == 1)
		{
		   word[k] = s.substring(i, i + findlen(i));
		   //printf("%d %d\n",min,minn);
		   if (max < findlen(i))
		   {
			 max = findlen(i);
			 maxn = k;
		   }
		   if (min > findlen(i))
		   {
			 min = findlen(i);
			 minn = k;
		   }
		   k++;
		}
		i++;
	  }
	  System.out.printf("%s\n%s",word[maxn],word[minn]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  i = Integer.parseInt(tempVar);
	  }
	  return 0;
	}

}

