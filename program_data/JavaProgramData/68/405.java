package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
			  a = 3;
			  b = m - 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  abc:
		  for (i = 2;i <= Math.sqrt(a);i++)
		  {
		  if (a % i == 0)
		  {
		  a = a + 2;
		  b = b - 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto abc;
		  }
		  }
		  for (j = 2;j <= Math.sqrt(b);j++)
		  {
		  if (b % j == 0)
		  {
		  a = a + 2;
		  b = b - 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto abc;
		  }
		  }
		  System.out.printf("%ld=%ld+%ld\n",m,a,b);
		}
	}
}

