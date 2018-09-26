package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			do
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								x:
				   if (a % 2 == 0)
				   {
					   System.out.printf("%d/2=%d\n",a,a / 2),a = a / 2;
				   }
				   else
				   {
					   System.out.printf("%d*3+1=%d\n",a,a * 3 + 1),a = a * 3 + 1;
				   }
				   if (a == 1)
				   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto y;
				   }
				   else
				   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto x;
				   }
			} while (a = 1);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		y:
		System.out.print("End\n");
		}
	return 0;
	}

}

