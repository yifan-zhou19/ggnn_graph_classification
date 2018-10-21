package <missing>;

public class GlobalMembers
{
	public static int times;
	public static int move(int a,int num) //a??????
	{
		int i;
		if (num == 1)
		{
			times++;
		}
	   for (i = 2;i <= num;i++)
	   {
		   if (num % i == 0 && i >= a)
		   {
			   move(i, num / i);
		   }
	   }
	   return times;
	}
	public static int Main()
	{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int[] b = new int[n]; //??????
	for (i = 0;i < n;i++)
	{
			times = 0;
		b[i] = move(1, a[i]);
	}
	for (i = 0;i < n;i++)
	{
		System.out.print(b[i]);
		System.out.print("\n");
	}
	return 0;
	}
}

