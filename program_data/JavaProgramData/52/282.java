package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *dt;
		int dt;
		int n;
		int m;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		dt = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < (n - m);i++)
		{
			*(dt + i + m) = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
		*(dt + i + m) = j;
		}
		for (i = (n - m);i < n;i++)
		{
			*(dt + i - n + m) = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				j = Integer.parseInt(tempVar4);
			}
		*(dt + i - n + m) = j;
		}
		System.out.printf("%d",dt[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",dt[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(dt);

		return 0;
	}

}

