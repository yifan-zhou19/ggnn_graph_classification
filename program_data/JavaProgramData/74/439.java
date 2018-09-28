package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int judge = new int(int a,int b,int c);
		  int sushu = int n;
		  int M;
		  int N;
		  int o;
		  int i;
		  int l;
		  int L;
		  int K;
		  int flag;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  M = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  N = Integer.parseInt(tempVar2);
		  }
		  flag = 0;
		  for (n = M;n <= N;n++)
		  {
			 o = 1;
		  for (i = 1;;i++)
		  {
				 o = o * 10;
			  if (o > n)
			  {
				   l = i;
				break;
			  }
		  }
		  if (l % 2 == 0)
		  {
			L = l / 2;
		  }
		  else
		  {
			L = (l - 1) / 2;
		  }
		  if (sushu(n) != 0 && judge(n, L, l) != 0)
		  {
			   System.out.printf("%d",n);
			K = n + 1;
			flag = 1;
			break;
		  }
		  }
		  for (n = K;n <= N;n++)
		  {
			 o = 1;
		  for (i = 1;;i++)
		  {
				 o = o * 10;
			  if (o > n)
			  {
				   l = i;
				break;
			  }
		  }
		  if (l % 2 == 0)
		  {
			L = l / 2;
		  }
		  else
		  {
			L = (l - 1) / 2;
		  }
		  if (sushu(n) != 0 && judge(n, L, l) != 0)
		  {
			   System.out.printf(",%d",n);
			flag = flag + 1;
		  }
		  }
		  if (flag == 0)
		  {
			System.out.print("no\n");
		  }
	}
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
		  if (n % i == 0)
		  {
			return 0;
		  }
		}
		return 1;
	}
	public static int judge(int a,int b,int c)
	{
		 int i;
		 int x;
		 int y;
		 int o;
		 i = x = y = o = 1;
		 if (b == 1)
		 {
			 for (i = 1;i <= c - 1;i++)
			 {
			o = o * 10;
			 }
		  if (a / o == a % 10)
		  {
		   return 1;
		  }
		  else
		  {
		   return 0;
		  }
		 }
		 else
		 {
			  for (i = 1;i <= b - 1;i++)
			  {
			 x = x * 10;
			  }
		   for (i = 1;i <= c - b;i++)
		   {
			 y = y * 10;
		   }
		   if ((a / y) % 10 == (a / x) % 10)
		   {
			 if (judge(a, b - 1, c) != 0)
			 {
			   return 1;
			 }
			 else
			 {
			   return 0;
			 }
		   }
		   else
		   {
			 return 0;
		   }
		 }
	}
}

