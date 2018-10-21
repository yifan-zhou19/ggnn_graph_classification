package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*max;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		max = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i <= k - 1;i++)
		{
			t = 0;
			for (j = 0;j < i;j++)
			{
				if (*(p + j) >= *(p + i))
				{
					if (t < *(max + j))
					{
						t = (max + j);
					}
				}
			}
			*(max + i) = t + 1;
		}

		t = 0;
		for (i = 0;i <= k - 1;i++)
		{
			if (*(max + i) > t)
			{
				t = (max + i);
			}
		}
		System.out.printf("%d",t);

	}
}

