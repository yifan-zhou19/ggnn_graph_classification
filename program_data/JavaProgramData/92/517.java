package <missing>;

public class GlobalMembers
{
	public static final int MAX = 1005;
	public static int Main()
	{
	 int n;
	 int[] tian = new int[MAX];
	 int[] king = new int[MAX];
	 while (scanf("%d", n), n)
	 {
	  for (int i = 0; i < n; i++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   tian[i] = Integer.parseInt(tempVar);
	   }
	  }
	  for (int i = 0; i < n; i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   king[i] = Integer.parseInt(tempVar2);
	   }
	  }
	  sort(tian, tian + n);
	  sort(king, king + n);

	  int tian_fast = n - 1;
	  int king_fast = n - 1;
	  int result = 0;
	  int tian_slow = 0;
	  int king_slow = 0;
	  while (tian_slow <= tian_fast != 0 && king_slow <= king_fast)
	  {
	   if (tian[tian_slow] < king[king_slow])
	   {
		king_fast--;
		tian_slow++;
		result--;
	   }
	   else if (tian[tian_slow] > king[king_slow])
	   {
		tian_slow++;
		king_slow++;
		result++;
	   }
	   else
	   {
		if (tian[tian_fast] > king[king_fast])
		{
		 result++;
		 tian_fast--;
		 king_fast--;
		}
		else if (tian[tian_fast] < king[king_fast])
		{
		 result--;
		 tian_slow++;
		 king_fast--;
		}
		else
		{
		 if (tian[tian_slow] < king[king_fast])
		 {
		  result--;
		  tian_slow++;
		  king_fast--;
		 }
		 else
		 {
		  break; //??????
		 }
		}
	   }
	  }
	  System.out.printf("%d\n", result * 200);
	 }
	 return 0;
	}

}

