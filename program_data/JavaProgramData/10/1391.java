package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int highget = 0;
	public static int[] num = new int[25];
	public static int Main()
	{
	  int i;
	  void shoot(int i,int high,int get);

	  //input
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
	  }

	  //progress
	  shoot(1, 32767, 0);
	  System.out.printf("%d",highget);
	  return 0;
	}
	public static void shoot(int i,int high,int get)
	{
	  if (i == n)
	  {
		  if (num[i] <= high)
		  {
		get++;
		  }
		  if (get > highget)
		  {
		highget = get;
		  }
	  }
	  else
	  {
		  shoot(i + 1, high, get);
		  if (num[i] <= high)
		  {
		shoot(i + 1, num[i], get + 1);
		  }
	  }
	}
}

