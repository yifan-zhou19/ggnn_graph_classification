package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] t = new int[1000];
	   int[] x = new int[1000];
	   int[] y = new int[1000];
	   int i;
	   int n = 0;
	   while (true)
	   {
		   x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n++;
		   if (cin.peek() != '\n')
		   {
			   System.in.read();
		   }
		   else
		   {
			   break;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.in.read();
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (int j = x[i];j < y[i];j++)
		   {
			   t[j]++;
		   }
	   }
	   int max = 0;
	   for (i = 0;i < 1000;i++)
	   {
		   if (t[i] > max)
		   {
				  max = t[i];
		   }
	   }
	   System.out.print(n);
	   System.out.print(" ");
	   System.out.print(max);
	   return 0;
	}

}

