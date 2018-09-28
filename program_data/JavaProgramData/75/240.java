package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] list1 = new int[1000];
		int[] list2 = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			list1[0] = Integer.parseInt(tempVar);
		}
		int count = 1;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", list1[count++]) != 0)
		{
			;
		}
		count--;
		int index = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			list2[0] = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", list2[index++]) != 0)
		{
			;
		}

		int max = 0;
		int num = 0;
		int i = 0;
		for (i = 0;i < 1000;i++)
		{
			num = 0;
			for (index = 0;index < count;index++)
			{
				if (i >= list1[index] != 0 && i < list2[index])
				{
					num++;
				}
			}
			if (num > max)
			{
				max = num;
			}
		}

		System.out.printf("%d %d",count,max);
		return 0;
	}
}

