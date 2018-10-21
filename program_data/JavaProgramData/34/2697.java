package <missing>;

public class GlobalMembers
{
	public static int fun1(int i)
	{
	//printf("fun1");
		int j;
		j = i * 3 + 1;
		System.out.printf("%d*3+1=%d\n",i,j);
		return j;
	}



	public static int fun2(int i)
	{
		//printf("fun2");
		int j;
		j = i / 2;
		System.out.printf("%d/2=%d\n",i,j);
		return j;
	}


	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		do
		{
			if (i % 2 == 1 && i != 1)
			{
				i = fun1(i);
			}
			else if (i % 2 == 0)
			{
				i = fun2(i);
			}
		} while (i != 1);
		System.out.print("End");

		return 0;
	}


}

