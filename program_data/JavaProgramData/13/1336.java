package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m + i = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", m);
		for (i = 1;i < n;i++)
		{
			l = 0;
			for (j = 0;j < i;j++)
			{
			   if (*(m + i) == *(m + j))
			   {
				   l = 1;
				   break;
			   }
			}
			if (l == 0)
			{
				  System.out.printf(" %d",*(m + i));
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m);
		return 0;
	}
}

