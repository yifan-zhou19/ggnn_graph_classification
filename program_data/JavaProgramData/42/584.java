package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void move(int * p1, int x); //?p1???x???????
		int[] a = new int[num];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j = 0;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (p = a;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p = a;
		for (i = 0;i < n - j;)
		{
			if (*(p + i) == k)
			{
				move(p + i, n - 1 - i);
				j++;
			}
			else
			{
				i++;
			}
		}
		for (p = a;p < a + n - j - 1;p++)
		{
			System.out.printf("%ld ",*p);
		}
		System.out.printf("%ld",*p);
	}
	public static void move(tangible.RefObject<Integer> p1, int x)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * c;
		for (c = p1.argValue;c < p1.argValue + x;c++)
		{
			*c = (c + 1);
		}
	}
}

