package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int huan;
		int i;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*t;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		if ((t = (int)malloc((2 * n - m) * (Integer.SIZE / Byte.SIZE))) == null)
		{
			System.out.print("No space avaible!");

		}
		for (p = t;p < t + n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - m;i++)
		{

			t[n + i] = t[i];
		}
		for (p = t + n - m;p < t + (2 * n - m - 1);p++)
		{
			System.out.printf("%d ", p);
		}
		System.out.printf("%d", p);
	}
}

