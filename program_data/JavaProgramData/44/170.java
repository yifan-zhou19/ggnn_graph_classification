package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		  int a;
		  int h;
		  int i;
		  int j;
		  int k;
		  int o = 0;
		  int s = 1;
		  int t = 10;
		  int NUM = 0;
		  int[] n = new int[N];
		  if (num < 0)
		  {
			   num = 0 - num;
			   o = 1;
		  }
		  for (h = 2;h <= N + 2;h++)
		  {
			   s = s * 10;
			   if (num / s == 0)
			   {
			   break;
			   }
		  }
		  for (i = 0;i < N;i++)
		  {
			   a = num % t;
			   num = num / t;
			   n[i] = a;
		  }
		  t = 1;
		  for (j = 2;j < h;j++)
		  {
			   t = t * 10;
		  }
		  for (k = 0;k < N;k++)
		  {
			   NUM = NUM + t * n[k];
			   t = t / 10;
		  }
		  if (o == 1)
		  {
		  NUM = 0 - NUM;
		  }
		  return NUM;
	}
	public static int Main()
	{
		  int num;
		  int i;
		  for (i = 1;i <= 6;i++)
		  {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   num = Integer.parseInt(tempVar);
			   }
			   System.out.printf("%d\n",reverse(num));
		  }
	}
}

