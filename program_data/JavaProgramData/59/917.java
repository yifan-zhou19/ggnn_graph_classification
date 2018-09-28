package <missing>;

public class GlobalMembers
{
	public static final String c = "";
	public static int k = 0;
	public static int[] l = new int[10000];
	public static int dete(int r)
	{
	   return l[r];
	}
	public static int num(int n,int m)
	{
	   if (m == 0)
	   {
		   return k;
	   }
	   else
	   {
		   return num(n, m - 1) + dete(m - 2);
	   }
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int m;
	   k = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   c.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
		   }
	   }
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   if (c.charAt(i)[j] == '@')
			   {
				   k++;
			   }
		   }
	   }
	   int t = 0;
	   while (t <= m)
	   {
		   for (i = 0;i < n;i++)
		   {
			   for (j = 0;j < n;j++)
			   {
				 if (c.charAt(i)[j] == '.' && (c.charAt(i - 1)[j] == '@' || c.charAt(i)[j - 1] == '@' || c.charAt(i)[j + 1] == '@' || c.charAt(i + 1)[j] == '@'))
				 {
					 c.charAt(i)[j] = '*';
					 l[t]++;
				 }
			   }
		   }
			  for (i = 0;i < n;i++)
			  {
				 for (j = 0;j < n;j++)
				 {
					if (c.charAt(i)[j] == '*')
					{
					   c.charAt(i)[j] = '@';
					}
				 }
			  }
		   t++;
	   }
	   System.out.print(num(n, m));

	   return 0;
	}

}

