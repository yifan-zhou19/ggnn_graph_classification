package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int[] c = new int[1000];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int t;
		int m;
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
		for (i = 0;i < a;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 0;j < b;j++)
		{
			p = c;
		for (i = 1,t = c[0];i < a;i++)
		{
			m = (p + i);
			*(p + i) = t;
			t = m;
		}
		 c[0] = t;
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i < a;i++)
		{
		System.out.printf(" %d",c[i]);
		}
		System.out.print("\n");
	}
}

