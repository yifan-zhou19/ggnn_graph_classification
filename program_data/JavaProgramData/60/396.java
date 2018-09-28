package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag;
		int j;
		int num = 0;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *index;
		int index;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		index = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 2;i <= n;i++) //???????
		{
			flag = 1;
			m = (int)Math.sqrt((float)i);
			for (j = 2;j <= m != 0 && flag == 1;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				(*(index + num)) = i;
				num++;
			}
		}
		flag = 0; //?????????????
		for (i = 0;i < num - 1;i++)
		{
			if (*(index + i) == (*(index + i + 1) - 2))
			{
				flag = 1;
				System.out.printf("%d %d\n",*(index + i),*(index + i + 1));
			}
		}
		if (flag == 0)
		{
			System.out.print("empty");
		}
	}

}

