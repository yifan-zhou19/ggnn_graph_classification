package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int flag = 0;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct number
	//	{
	//		int size;
	//		int mark;
	//	}
	//	num[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].size = tempVar2;
			}
		}

		for (i = 0;i < n;i++)
		{
			num[i].mark = 1;
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[j].size == num[i].size)
				{
					num[j].mark = 0;
				}
			}
		}

		for (i = 0;i < n;i++)
		{

			if (num[i].mark == 1)
			{
				if (flag == 1)
				{
					System.out.print(",");
				}
				flag = 1;
				System.out.printf("%d",num[i].size);
			}
		}

	System.out.print("\n");
	}
}

