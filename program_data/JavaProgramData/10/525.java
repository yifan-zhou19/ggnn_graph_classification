package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] input = new int[26];
	public static int i;
	public static int j;
	public static int k;
	public static int[] ans = new int[26];
	public static int Max;
	public static int cons(int i)
	{
	   int a = 0;
	   if (ans[i] != 0)
	   {
		 return ans[i];
	   }
	   for (int j = i + 1;j < N;j++)
	   {
		 if (input[j] <= input[i])
		 {
			if (a < cons(j))
			{
			   a = ans[j];
			}
		 }
	   }
	   ans[i] = a + 1;
	   return ans[i];
	}
	public static int Main()
	{
		Max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   input[i] = Integer.parseInt(tempVar2);
		   }
		   ans[i] = 0;
		}
		for (i = N - 1;i >= 0;i--)
		{
			if (Max < cons(i))
			{
			   Max = ans[i];
			}
		}
		System.out.printf("%d\n",Max);
		return 0;
	}
}

