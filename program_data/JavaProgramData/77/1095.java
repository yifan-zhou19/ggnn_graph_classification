package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static char a;
	public static char b;
	public static int[] num = new int[100];
	public static int n;
	public static int q = 0;
	public static int Main()
	{
		void p();
	  int i;
	  s = new Scanner(System.in).nextLine();
	  n = s.length();
	  for (i = 0;i < 100;i++)
	  {
	   num[i] = 1;
	  }
	  a = s.charAt(0);
	  b = s.charAt(n - 1);
	  p();
	  return 0;
	}

	public static void p()
	{
		int i;
		int j;
		int t = 0;
		int m;
	   for (i = 0;i < n - 1;i++)
	   {
			 for (j = i + 1;j < n;j++)
			 {
			for (m = i + 1;m < j;m++)
			{
			   if (num[m] != 0)
			   {
				   break;
			   }
			}
		   if (s.charAt(i) == a && s.charAt(j) == b && num[i] == 1 && num[j] == 1 && m == j)
		   {
			   System.out.printf("%d %d\n",i,j);
			 num[i] = 0;
			 num[j] = 0;
			 t = 1;
		   }
			if (t == 1)
			{
				break;
			}
			 }
		   if (t == 1)
		   {
			   break;
		   }
	   }
		  q++;
		 if (q != n / 2)
		 {
			 p();
		 }
	}




}
