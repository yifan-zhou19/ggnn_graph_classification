package <missing>;

public class GlobalMembers
{
	 public static int sushu(int n)
	 {
		  int i;
		  int j;
		  for (j = 0,i = 2;i <= (int)Math.sqrt(n);i++)
		  {
				 if (n % i != 0)
				 {
					j = j + 1;
				 }
		  }
			 if (j >= (int)Math.sqrt(n) - 1)
			 {
				return (1);
			 }
			 else
			 {
				 return (0);
			 }

	 }
	public static int Main()
	{
		int sushu = int n;
	 int a;
	 int b;
	 int n;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	if (n <= 4)
	{
		System.out.print("empty");
	}
	else
	{
	 for (i = 2;i <= n - 1;i++)
	 {
			if (sushu(i) == 1 && sushu(i + 2) == 1)
			{
			   System.out.printf("%d %d\n",i,i + 2);
			 a += 1;
			}
	 }
	}
	}


}

