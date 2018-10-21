package <missing>;

public class GlobalMembers
{
	public static int[] y = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
	public static int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	public static int q;
	public static int[] z = new int[1000];

//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* count1(int n)
	public static int[] count1(int n)
	{
		int i;
		int j;
		int k;
		int m;
		int l;
		i = 0;
		while (n != 0)
		{
			y[i] = n;
			n = n / 2;

			i++;
		}
		return y;
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* count2(int x)
	public static int[] count2(int x)
	{
		int i;
		int j;
		int k;
		int m;
		int l;
		i = 0;
		while (x != 0)
		{
			z[i] = x;
			x = x / 2;

			i++;
		}
		return z;
	}
	public static int compare()
	{
		int i;
		int j;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				if (*(p + i) == *(q + j))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto MM;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	MM:
		return *(p + i);
	}
	public static void Main()
	{
		int i;
		int j;
		int s;
		int t;
		int c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		p = count1(s);
		q = count2(t);
		c = compare();
		System.out.printf("%d\n",c);
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	}

}

