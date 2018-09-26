package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m = 6;
	int a = 3;
	int b;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (m <= n)
	{
	   a = 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   loop:
	   b = m - a;
	   j = Math.sqrt(a);
	   for (i = 2;i <= j;i++)
	   {
	   if (a % i == 0)
	   {
		a = a + 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
	   }
	   }
	   if (i >= j + 1)
	   {
			k = Math.sqrt(b);
		 for (i = 2;i <= k;i++)
		 {
		 if (b % i == 0)
		 {
		 a = a + 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 goto loop;
		 }
		 }
		 if (i >= k + 1)
		 {
		 System.out.printf("%d=%d+%d\n",m,a,b);
		 }
	   }
	   m = m + 2;
	}
	}

}

