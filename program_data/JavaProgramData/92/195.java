package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] tian = new int[1001];
	public static int[] king = new int[1001];
	public static void sort(int[] a)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			 for (j = i + 1;j <= n - 1;j++)
			 {
					if (a[j] < a[i])
					{
						  temp = a[j];
						  a[j] = a[i];
						  a[i] = temp;
					}
			 }
		}
	}

	public static void Main()
	{
		int i;
		for (scanf("%d",n);n > 0;scanf("%d",n))
		{
			  for (i = 0;i < n;i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  tian[i] = Integer.parseInt(tempVar);
				  }
			  }
			   for (i = 0;i < n;i++)
			   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					king[i] = Integer.parseInt(tempVar2);
				}
			   }
			 sort(tian);
			 sort(king);
			 int begin_tian = 0;
			 int end_tian = n - 1;
			 int begin_king = 0;
			 int end_king = n - 1;
			 int money = 0;
			while (begin_tian <= end_tian)
			{
				while ((tian[begin_tian] > king[begin_king]) && (begin_tian <= end_tian))
				{
						  money = money + 200;
						  begin_tian++;
						  begin_king++;
				}
				while ((tian[end_tian] > king[end_king]) && (begin_tian <= end_tian))
				{
						 money = money + 200;
						 end_tian--;
						 end_king--;
				}
				if (begin_tian <= end_tian)
				{
					   if (tian[begin_tian] < king[end_king])
					   {
						money = money - 200;
					   }
						begin_tian++;
						end_king--;
				}
			}
		System.out.printf("%d\n",money);
		}
	}


}

