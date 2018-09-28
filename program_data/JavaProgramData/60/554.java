package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int isit = int;
		int n;
		int empt = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 2;i <= n - 2;i++)
		{
			if (isit(i) != 0 && isit(i + 2) != 0)
			{
				empt = 0;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (empt != 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
	public static int isit(int num)
	{
		int i;
		for (i = 2;i * i <= num;i++)
		{
			if (num % i == 0)
			{
				return 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
			}
		}
		return 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}
}

