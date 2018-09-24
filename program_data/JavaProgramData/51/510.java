package <missing>;

public class GlobalMembers
{
	public static char[][] str = new char[501][5];
	public static String a = new String(new char[501]);
	public static void Main(String[] args)
	{
		int n;
		int m;
		int k = 0;
		int i;
		int j;
		String temp = new String(new char[5]);
		int[] b = new int[501];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		//puts(a);
		m = a.length();
		for (i = 0;i <= m - n;i++)
		{
		   for (j = i;j < i + n;j++)
		   {
			   str[i][j - i] = a.charAt(j);
		   }
		   b[i] = 1;
		}
	   for (i = 0;i <= m - n;i++)
	   {
		  for (j = i + 1;j <= m - n;j++)
		  {
		   if (strcmp(str[i],str[j]) == 0)
		   {
			   b[i]++;
		   }
		  }
		  if (b[i] > max)
		  {
			  max = b[i];
		  }
	   }
		if (max == 1)
		{
			System.out.print("NO");
		}
		else if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= m - n;i++)
		{
		  if (b[i] == max)
		  {
		   System.out.printf("%s",str[i]);
		   System.out.print("\n");
		  }
		}
		}
	}


}

