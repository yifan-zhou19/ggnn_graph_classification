package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static PrimeNumber(int n)
	{
		int k;
		int i;
		int flag = 0;
	 k = Math.sqrt(n);
	 for (i = 2;i <= k;i++)
	 {
		 if (n % i == 0)
		 {
			 break;
		 }
	 }
	 if (i > k)
	 {
		 flag = 1;
	 }
	 return flag;
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static LoopNumber(int n)
	{
	int a;
	int b = 0;
	int c;
	int flag = 0;
	a = n;
	for (;a != 0;)
	{
	c = a % 10;
	a = a / 10;
	b = b * 10 + c;
	}
	if (b == n)
	{
		flag = 1;
	}
	  return flag;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		int[] a = new int[100];
		int flag1;
		int flag2;
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
			flag1 = PrimeNumber(i);
		 flag2 = LoopNumber(i);
		 if (flag1 == 1 && flag2 == 1)
		 {
			 a[k] = i;
			 k++;
		 }
	 }
	 if (k > 0)
	 {
			System.out.printf("%d",a[0]);
		 for (i = 1;i < k;i++)
		 {
			 System.out.printf(",%d",a[i]);
		 }
	 }
	 if (k == 0)
	 {
		 System.out.print("no");
	 }
	}
}

