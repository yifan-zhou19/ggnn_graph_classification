package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] start = new int[1000];
		int[] end = new int[1000];
		int[] time = new int[1024];
		int n = 0;
		int i = 0;
		for (i = 0;;i++) //?????????�?�
		{
		   n++;
		   start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   char c = System.in.read();
		   if (c != ',')
		   {
				break;
		   }
		}
		for (i = 0;;i++)
		{
		   end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   char c = System.in.read();
		   if (c != ',')
		   {
			  break;
		   }
		}
		for (i = 0;i < 1024;i++)
		{
		   time[i] = 0;
		}
		for (i = 0;i < n;i++) //??????
		{
		   for (int j = start[i];j < end[i];j++)
		   {
			  time[j]++;
		   }
		}
		int max = 0;
		for (i = 0;i < 1024;i++) //?????????
		{
		   if (max < time[i])
		   {
				max = time[i];
		   }
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
	}
}

