package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int a;
		int b;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc((Integer.SIZE / Byte.SIZE) * 10000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 1;j <= b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num + (i - 1) * b + j = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 1;i < b;i++)
		{
			p = i;
			for (;;)
			{
				System.out.printf("%d\n",*(num + p));
				if (p % b == 1 || p > b * (a - 1))
				{
					break;
				}
				p += b - 1;
			}
		}

		for (i = b;i <= a * b;i += b)
		{
			p = i;
			for (;;)
			{
				System.out.printf("%d\n",*(num + p));
				if (p % b == 1 || b == 1 || p > b * (a - 1))
				{
					break;
				}
				p += b - 1;
			}
		}


	}
}

