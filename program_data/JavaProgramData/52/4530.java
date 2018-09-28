package <missing>;

public class GlobalMembers
{
	public static int n; //n????????????m????????
	public static int m;
	public static int Main()
	{
		void f(int a[]);
		int i; //??n????100.??a[100]???n???
		int[] a = new int[100];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		f(a);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
			  System.out.printf("%d",a[n - 1]);
	}
	public static void f(int[] a)
	{
		int i;
		int[] p = a;
		int t;
		for (i = n - 1;i > 0;i--) //???????1???
		{
			t = p[i];
			p[i] = (p + i - 1);
			p[i - 1] = t;
		}
		m--;
		if (m != 0)
		{
			f(a); //???????0?????
		}
	}
}

