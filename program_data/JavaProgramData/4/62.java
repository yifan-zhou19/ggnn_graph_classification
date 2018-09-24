package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(11000 * (Integer.SIZE / Byte.SIZE));
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
		for (i = 0;i < a * b;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < b;i++)
		{
			k = i;
			j = 0;
			while (k >= 0 && j < a)
			{
				System.out.printf("%d\n",*(p + k + j * b));
				k--;
				j++;
			}
		}
		for (i = 1;i <= a;i++)
		{
			k = i;
			j = 0;
			while (k < a && j < b)
			{
				System.out.printf("%d\n",*(p + b - 1 - j + k * b));
				j++;
				k++;
			}
		}
	}

}

