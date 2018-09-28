package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[200];
	public static int[] b = new int[100];
	public static int a1;
	public static int b1;

	public static void read()
	{
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < b1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void ex(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int temp;
		temp = a.argValue;
		a.argValue = b.argValue;
		b.argValue = temp;
	}

	public static void bubblesort1(tangible.RefObject<Integer> p, int m, int n)
	{
		int i;
		int j;
		for (i = n;i > 0;i--)
		{
			for (j = m;j < i;j++)
			{
				if (*(p.argValue + j) > *(p.argValue + j + 1))
				{
					ex(p.argValue + j, p.argValue + j + 1);
				}
			}
		}
	}

	public static void sort()
	{
	}


	public static void and()
	{
		int i;
		for (i = 0;i < b1;i++)
		{
			a[a1 + i] = b[i];
		}
	}

	public static void prt()
	{
		int i;
		for (i = 0;i < a1 + b1;i++)
		{
			System.out.printf("%d%c",a[i],(i < a1 + b1 - 1)?' ':'\n');
		}
	}
	public static void Main()
	{
		read();
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
		bubblesort1(tempRef_a, 0, a1 - 1);
		a = tempRef_a.argValue;
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		bubblesort1(tempRef_b, 0, b1 - 1);
		b = tempRef_b.argValue;
		and();
		prt();
	}

}

