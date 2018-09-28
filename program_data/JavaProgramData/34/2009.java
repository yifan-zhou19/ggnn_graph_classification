package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		turn:
		if (n != 1)
		{
				if (n % 2 == 0)
				{
							System.out.printf("%d/2=%d\n",n,n / 2);
							n = n / 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto turn;
				}
				else
				{
					 System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
					 n = n * 3 + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					 goto turn;
				}
		}
		System.out.print("End");
	}

}

