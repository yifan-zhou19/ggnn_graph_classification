package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int i;
	 int n;
	 a = 3;
	 b = 5;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n < 5)
	 {
		 System.out.print("empty");
	 }
	while (b <= n)
	{
	 for (i = 2;i < (a + 1) / 2;i++)
	 {
	  if ((a % i) == 0)
	  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loop;
	  }
	 }
	  for (i = 2;i < (b - 1) / 2;i++)
	  {
	  if ((b % i) == 0)
	  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loop;
	  }
	  }
	 System.out.printf("%d %d\n",a,b);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 loop:
	 a = a + 2;
	 b = b + 2;
	}

	}
}

