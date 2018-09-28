package <missing>;

public class GlobalMembers
{
	public static int ok(int a)
	{
		int i;
		for (i = 2;i * i <= a;i++)
		{
		if (a % i == 0)
		{
			return 0;
		}
		}
		return 1;
	}
	public static int num(int nu)
	{
		int i;
		int j;
		if (ok(nu) == 0)
		{
			return 0;
		}
		for (i = nu,j = 0;i > 0;i /= 10)
		{
								j = j * 10 + i % 10;
		}
		if (ok(j) == 0)
		{
			return 0;
		}
		else if (j != nu)
		{
			return 0;
		}
		else if (j == nu && ok(j) != 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 int count = 0;
		 int[] a = new int[1000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (i = m;i <= n;i++)
		 {
				 if (ok(i) != 0)
				 {
						  if (num(i) != 0)
						  {
									a[count] = i;
									count++;
						  }
				 }
		 }
		 if (count == 0)
		 {
			 System.out.print("no");
		 }
		 else
		 {
			 for (i = 0;i < count - 1;i++)
			 {
		 System.out.printf("%d,",a[i]);
			 }
		 System.out.printf("%d",a[count - 1]);
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}

}

