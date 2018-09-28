package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i == 1)
		{
		System.out.print("End");
		}
		for (;i != 1;)
		{
		if (i % 2 == 0)
		{
			j = i / 2;
		System.out.printf("%d/2=%d\n",i,j);
		}
		else
		{
			j = 3 * i + 1;
		System.out.printf("%d*3+1=%d\n",i,j);
		}
		if (j == 1)
		{
			System.out.print("End");
		break;
		}
		else
		{
			if (j % 2 == 0)
			{
			i = j / 2;
		System.out.printf("%d/2=%d\n",j,i);
			}
		else
		{
			i = 3 * j + 1;
		System.out.printf("%d*3+1=%d\n",j,i);
		}
		   if (i == 1)
		   {
			   System.out.print("End");
		   break;
		   }
		}
		}
	}
}

