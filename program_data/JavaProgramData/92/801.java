package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] tj = new int[1001];
	public static int[] qw = new int[1001];

	public static int Main()
	{
		void sort(int speed[]);
		int i;
		for (scanf("%d",n);n > 0;scanf("%d",n))
		{
			  for (i = 0;i < n;i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  tj[i] = Integer.parseInt(tempVar);
				  }
			  }
			   for (i = 0;i < n;i++)
			   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qw[i] = Integer.parseInt(tempVar2);
				}
			   }
			 sort(tj);
			 sort(qw);
			 int start_tj = 0;
			 int end_tj = n - 1;
			 int start_qw = 0;
			 int end_qw = n - 1;
			 int money = 0;
			while (start_tj <= end_tj)
			{
				while ((tj[start_tj] > qw[start_qw]) && (start_tj <= end_tj))
				{
						  money = money + 200;
						  start_tj++;
						  start_qw++;
				}
				while ((tj[end_tj] > qw[end_qw]) && (start_tj <= end_tj))
				{
						 money = money + 200;
						 end_tj--;
						 end_qw--;
				}
				if (start_tj <= end_tj)
				{
					   if (tj[start_tj] < qw[end_qw])
					   {
						money = money - 200;
					   }
						start_tj++;
						end_qw--;
				}
			}
		System.out.printf("%d\n",money);
		}
		return 0;
	}
	public static void sort(int[] speed)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			 for (j = i + 1;j <= n - 1;j++)
			 {
					if (speed[j] < speed[i])
					{
						  temp = speed[j];
						  speed[j] = speed[i];
						  speed[i] = temp;
					}
			 }
		}
	}



}

