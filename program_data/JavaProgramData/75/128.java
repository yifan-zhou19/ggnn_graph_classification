package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int max = 0;
	  int[] a = new int[2000];
	  int[] b = new int[2000];
	  for (i = 1; ;i++)
	  {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (System.in.read() == '\n')
		{
			break;
		}
	  }
	  for (j = 1;j <= i;j++)
	  {
	   b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	  }
	   n = i;
	  for (i = 0;i <= 999;i++)
	  {
		int s = 0;
		for (j = 1;j <= n;j++)
		{
		   if (a[j] <= i != 0 && i < b[j])
		   {
			 s = s + 1;
		   }
		}
	   if (s > max)
	   {
		 max = s;
	   }
	  }
	 System.out.print(n);
	 System.out.print(" ");
	 System.out.print(max);
	 return 0;
	}



}

