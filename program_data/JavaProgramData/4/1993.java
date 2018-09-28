package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		(int)(*p)[100];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [100])malloc(100 * y * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < x;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(p + i) + j = tempVar3;
				}
			}
		}
		i = 0;
		j = 0;
			for (k = 0;k < x * y;k++)
			{
				System.out.printf("%d\n",*(*(p + i) + j));
				i++;
				j--;
				if (j < 0)
				{
					j = i + j + 1;
				 i = 0;
				}
				if (i >= y)
				{
					j = i + j + 1;
				 i = 0;
				}
				while (j >= x)
				{
					i++;
					j--;
				}


			}







	}
}

