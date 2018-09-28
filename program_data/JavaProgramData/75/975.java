package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] x = new int[1000];
	   int[] y = new int[1000];
	   int i;
	   int j;
	   int mm;
	   int k;
	   int m;
	   int[] num = new int[1000];
	   char ch;
	   x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   i = 0;
	   while (ch == ',')
	   {
		 i++;
		 x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 ch = System.in.read();
	   }
	   y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		j = 0;
	   while (ch == ',')
	   {
		 j++;
		 y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 ch = System.in.read();
	   }
	   for (k = 0; k <= i; k++)
	   {
		   for (m = x[k]; m < y[k]; m++)
		   {
			num[m]++;
		   }
	   }
	   mm = 0;
	   for (k = 0; k < 1000; k++)
	   {
			if (num[k] > mm)
			{
				mm = num[k];
			}
	   }
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(mm);
		System.out.print("\n");

		return 0;
	}

}

