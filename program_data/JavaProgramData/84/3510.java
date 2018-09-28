package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,i,n,max,sec;
		int p;
		int i;
		int n;
		int max;
		int sec;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)(malloc(10000 * (Integer.SIZE / Byte.SIZE)));
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
				p + i = Integer.parseInt(tempVar2);
			}
		}
		max = p;
		sec = p;
		for (i = 1;i < n;i++)
		{
			if (*(p + i) > max)
			{
				max = (p + i);
			}
			else if (*(p + i) > sec)
			{
				sec = (p + i);
			}
		}
		System.out.printf("%d\n%d",max,sec);
	}
}

