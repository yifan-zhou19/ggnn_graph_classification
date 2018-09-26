package <missing>;

public class GlobalMembers
{
	public static void Input(int[] a, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void Turn(int[] a, int n, int m)
	{
		int i;
		int j;
		int temp;
		for (i = n - m;i < n;i++)
		{
			for (j = i - 1;j >= i - n + m;j--)
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static Output(int[] a, int n)
	{
		int i;
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		int n;
		int m;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		Input(num, n);
		Turn(num, n, m);
		Output(num, n);
	}
}

