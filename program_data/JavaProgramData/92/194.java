package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] tian = new int[1010];
	public static int[] king = new int[1010];
	public static void sort(int[] a)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i < n;i++)
		{
			 for (j = i + 1;j <= n;j++)
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
		int j;
		int money;
		for (scanf("%ld",n);n > 0;scanf("%ld",n))
		{
			  for (i = 1;i <= n;i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  tian + i = tempVar;
				  }
			  }
			   for (i = 1;i <= n;i++)
			   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					king + i = tempVar2;
				}
			   }
			 sort(tian);
			 sort(king);
			 int begin_tian = 1;
			 int end_tian = n;
			  int begin_king = 1;
			  int end_king = n;
			 money = 0;
			while (begin_tian <= end_tian)
			{
				while ((tian[begin_tian] > king[begin_king]) && (begin_tian <= end_tian))
				{
						  money += 200;
						  begin_tian++;
						  begin_king++;
				}
				while ((tian[end_tian] > king[end_king]) && (begin_tian <= end_tian))
				{
						 money += 200;
						 end_tian--;
						 end_king--;
				}
				if (begin_tian <= end_tian)
				{
					   if (tian[begin_tian] < king[end_king])
					   {
						money -= 200;
					   }
						begin_tian++;
						end_king--;
				}
			}
		System.out.printf("%ld\n",money);
		}
	}
}

