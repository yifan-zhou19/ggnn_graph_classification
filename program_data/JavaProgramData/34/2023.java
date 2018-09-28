package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		haha:
		if (a == 1)
		{
			System.out.print("End\n");
		}
		else
		{
		 if (a % 2 == 1)
		 {
			b = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,b);
			a = (a * 3) + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto haha;
		 }
		 if (a % 2 == 0)
		 {
			b = a / 2;
			System.out.printf("%d/2=%d\n",a,b);
			a = a / 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto haha;
		 }
		}
	}

}

