package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
	 int i;
	 for (i = 2;i <= Math.sqrt(a) + 1;i++)
	 {
		 if (a % i == 0)
		 {
			 a = 1;
			 break;
		 }
	 }
	 return a;
	}
	public static int Main()
	{
	  int n;
	  int s1;
	  int s2;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 2;j <= n / 2; j++)
	  {
	  s1 = sushu(j);
	  if (s1 != 1)
	  {
		k = n - s1;
		s2 = sushu(k);
		if (s2 != 1)
		{
		System.out.printf("%d %d\n",s1,s2);
		}
	  }
	  }
	 return 0;
	}
}

