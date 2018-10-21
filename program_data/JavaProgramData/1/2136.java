package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int c;
		int s = 0;
		int i;
		c = (int)Math.sqrt(a);
		for (i = b;i <= c;i++)
		{
		 if (a % i == 0)
		 {
		 s = s + f(a / i, i);
		 }
		}
		return s + 1;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] num = new int[1000];
		  for (i = 0;i < n;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(num[i], 2));
		  }
	}
}

