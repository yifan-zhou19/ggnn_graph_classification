package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int num;
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (num - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= (num - 1);i++)
		{
			for (p = a;p < a[i];p++)
			{
				if (p == a[i])
				{
					break;
				}
			}
			if (p == a[i])
			{
				System.out.printf(",%d",a[i]);
			}
		}

	}
}

