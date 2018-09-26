package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[100];
		int n;
		int i;
		int j;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		p = num;
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
			  if (*(p + j) == *(p + i))
			  {
			  m = 0;
			  break;
			  }
			  if (*(p + j) != *(p + i))
			  {
				  m = 1;
			  }
			}
			if (m == 1)
			{
				System.out.printf(",%d",*(p + i));
			}
		}

	}
}

