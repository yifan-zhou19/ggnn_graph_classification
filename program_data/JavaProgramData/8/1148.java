package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[300];
	public static char z;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int scan_m;
int n;
int i;
	public static void scan()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int m,n,i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			scan_m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= 99;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;z != '\n';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				z = tempVar4.charAt(0);
			}
		}
		z = 1;
		 for (i = 0;z != '\n';i++)
		 {
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				z = tempVar6.charAt(0);
			}
		 }
	}
	 public static void ord()
	 {
		int i;
		int j;
		int temp;
		for (i = 0;a[i] != '\0';i++)
		{
			for (j = i + 1;a[j] != '\0';j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (i = 0;b[i] != '\0';i++)
		{
			for (j = i + 1;b[j] != '\0';j++)
			{
				if (b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;

				}
			}
		}
	 }
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int bin_i;
int j;
int s;
	public static void bin()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int i,j,s;
	for (bin_i = 0;bin_i <= 299;bin_i++)
	{

		c[bin_i] = 0;
	}
		for (bin_i = 0;a[bin_i] != '\0';bin_i++)
		{
			c[bin_i] = a[bin_i];
		}
		for (j = 0;b[j] != '\0';j++)
		{
			c[j + bin_i] = b[j];
		}
	}

	public static void print()
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;c[i] != 0;i++)
		{
		System.out.printf(" %d",c[i]);
		}

	}

	public static int Main()
	{
		scan();
		ord();
		bin();
		print();
	}
}

