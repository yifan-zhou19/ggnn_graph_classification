package <missing>;

public class GlobalMembers
{
	public static int Min(int[] array)
	{
		int min = arrive[1];
		for (i = 2;i <= n;i++)
		{
			if (arrive[i] < min)
			{
			min = arrive[i];
			}
		}
		MinTime = min;
		return MinTime;
	}
	public static int Max(int[] array)
	{
		int max = 0;
		for (j = 1;j <= n;j++)
		{
			 if (leave[j] > max)
			 {
			 max = leave[j];
			 }
		}
		MaxTime = max;
		return MaxTime;
	}
	public static int i;
	public static int j;
	public static int MaxTime;
	public static int MinTime;
	public static int n = 1;
	public static int[] arrive = new int[1000];
	public static int[] leave = new int[1000];
	public static int Main()
	{
	   int k; //max??????,k ?????????
	   int max = 0;
	   char c; //??
	   int[] count = new int[1000]; //arrive??????????????leave??????????
	   arrive[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while ((c = System.in.read()) == ',') //???????????????????
	   {
		   arrive[++n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 1;i <= n;i++)
	   {
		   count[i] = 0; //????0
	   }
	   leave[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 2;i <= n;i++)
	   {
		   c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   leave[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 1;i <= n;i++)
	   {
		   MinTime = Min(arrive); //????????
	   }
	   for (j = 1;j <= n;j++)
	   {
		   MaxTime = Max(leave); //?????????????
	   }
	   for (k = MinTime;k <= MaxTime;k++)
	   {
		   for (i = 1;i <= n;i++)
		   {
		   if (k >= arrive[i] != 0 && k < leave[i]) //???????????????
		   {
				count[k]++;
		   }
		   }
	   }
	   for (i = MinTime;i <= MaxTime;i++)
	   {
		   if (count[i] > max)
		   {
		   max = count[i]; //???????
		   }
	   }
	   System.out.print(n);
	   System.out.print(' ');
	   System.out.print(max);
	   return 0;

	}

}

