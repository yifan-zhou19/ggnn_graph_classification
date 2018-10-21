package <missing>;

public class GlobalMembers
{
	public static int Max = 1;
	public static int max = 0;
	public static int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	public static int p;
	public static void f(int x)
	{
		int i;
		int height = (p + x);
		if (max > Max)
		{
			Max = max;
		}
		for (i = x + 1;i < k;i++)
		{
			if (*(p + i) <= height)
			{
				max += 1;
				f(i);
				max -= 1;
			}
		}
	}
	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;k - i > Max,i < k;i++)
		{
			max += 1;
			f(i);
			max -= 1;
		}
		System.out.printf("%d\n",Max);
	}
}

