package <missing>;

public class GlobalMembers
{
	public static int A;
	public static int B;
	public static int[] a;
	public static int[] b;
	public static int[] c = new int[500];
	public static void putin()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			B = Integer.parseInt(tempVar2);
		}
		a = new int[A];
		b = new int[B];
		for (i = 0;i < A;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < B;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
	}
	public static void replace()
	{
		int i;
		int j;
		int z;
		for (i = 0;i < A - 1;i++)
		{
		  for (j = 0;j < A - i - 1;j++)
		  {
		  if (a[j] > a[j + 1])
		  {
			  z = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = z;
		  }
		  }
		}
		for (i = 0;i < B - 1;i++)
		{
		  for (j = 0;j < B - i - 1;j++)
		  {
		  if (b[j] > b[j + 1])
		  {
			  z = b[j];
			  b[j] = b[j + 1];
			  b[j + 1] = z;
		  }
		  }
		}
	}
	public static void combine()
	{
		int i;
		for (i = 0;i < A;i++)
		{
		c[i] = a[i];
		}
		for (i = A;i < A + B;i++)
		{
		c[i] = b[i - A];
		}
	}
	public static void print()
	{
		int i;
		for (i = 0;i < A + B;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",c[i]);
			}
			else
			{
			System.out.printf(" %d",c[i]);
			}
		}

	}
	public static int Main()
	{
		putin();
		replace();
		combine();
		print();
	}

}

