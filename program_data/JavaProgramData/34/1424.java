package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a == 1)
	{
		System.out.print("End");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop_copperhead;
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop_cobra:
	e = a - (int)(a / 2) * 2;
	if (e == 0)
	{
		System.out.printf("%d/2=%d\n",a,a / 2);
		a = a / 2;
	}
	else
	{
		b = a * 3 + 1;
		System.out.printf("%d*3+1=%d\n",a,b);
		a = b;
	}
	if (a != 1)
	{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop_cobra;
	}
	else
	{
		System.out.print("End");
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop_copperhead:
	return 0;
	}
}

