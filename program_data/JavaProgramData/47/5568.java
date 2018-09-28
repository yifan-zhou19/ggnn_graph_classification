package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt;
		int pt;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		pt = a;

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt + i = Integer.parseInt(tempVar2);
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			if (flag == 0)
			{
				System.out.printf("%d",*(pt + i));
			flag = 1;
			}
			else
			{
				System.out.printf(" %d",*(pt + i));
			}
		}
	}



}

