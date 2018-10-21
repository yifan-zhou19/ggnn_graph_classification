package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50];
	public static int[] b = new int[50];
	public static int[] e = new int[100];
	public static int c;
	public static int d;
	public static void input()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < c;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < d;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void change()
	{
		int i;
		int j;
		int t;
		for (j = 0;j < c - 1;j++)
		{
			 for (i = 0;i < c - 1;i++)
			 {
				 if (a[i] > a[i + 1])
				 {
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
				 }
			 }
		}
		for (j = 0;j < d - 1;j++)
		{

			 for (i = 0;i < d - 1;i++)
			 {
				if (b[i] > b[i + 1])
				{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
				}
			 }
		}
	}
	public static void to()
	{
		int i;
		 for (i = 0;i < c;i++)
		 {
			 e[i] = a[i];
		 }
		 for (i = 0;i < d;i++)
		 {
			 e[i + c] = b[i];
		 }
	}

	public static void output()
	{
		int i;
		for (i = 0;i < (c + d) - 1;i++)
		{
			System.out.printf("%d ",e[i]);
		}
		System.out.printf("%d",e[c + d - 1]);

	}
	public static void Main()
	{
		 input();
		 change();
		 to();
		 output();
	}

}

