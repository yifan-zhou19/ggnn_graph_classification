package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	while (n % 2 == 0)
	{
			m = n / 2;
			System.out.printf("%d/2=%d\n",n,m);
			n = m;
			if (n == 1)
			{
				System.out.print("End");
				break;
			}
	}
		 if (n != 1)
		 {
			 m = n * 3 + 1;
			 System.out.printf("%d*3+1=%d\n",n,m);
			 n = m;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop;
		System.out.print("End");
		 }
	}
}

