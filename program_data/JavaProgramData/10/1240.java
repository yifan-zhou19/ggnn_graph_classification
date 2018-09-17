package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*num;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
		int n;
		int add;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc((Integer.SIZE / Byte.SIZE) * n);


		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
			*(num + i) = 1;
		}

		for (int i = n - 2;i >= 0;i--)
		{
			add = 0;
			for (int k = i + 1;k <= n - 1;k++)
			{
				if (*(p + i) >= *(p + k) && *(num + k) > add)
				{
					add = (num + k);
				}
				//printf ("%d",*(num+k));
				//printf ("%d",add);
			}
			*(num + i) += add;
		}
		int maxnum = 0;
		for (int i = 0;i <= n - 1;i++)
		{
			if (*(num + i) > maxnum)
			{
				maxnum = (num + i);
			}
			//printf ("%d",*(num+i));
		}
		System.out.printf("%d",maxnum);

		return 0;
	}

}

