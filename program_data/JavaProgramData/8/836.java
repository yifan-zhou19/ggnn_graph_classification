package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n1;
		int n2;
		void sca(int n,int a[]);
		void pai(int n,int a[]);
		void he(int n1,int n2,int a[],int b[]);
		void pri(int n1,int n2,int a[]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		sca(n1, a);
		sca(n2, b);
		pai(n1, a);
		pai(n2, b);
		he(n1, n2, a, b);
		pri(n1, n2, a);

		return 0;


	}
	public static void sca(int n, int[] a)
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
	public static void pai(int n, int[] a)
	{
		int temp;
		int i;
		int j;
		int flag;
		int min;
		for (i = 0;i < n;i++)
		{
			min = a[i];
			flag = i;
			for (j = i;j < n;j++)
			{
				if (min > a[j])
				{
					min = a[j];
					flag = j;
				}
			}
			temp = a[i];
			a[i] = a[flag];
			a[flag] = temp;
		}
	}
	public static void he(int n1, int n2, int[] a, int[] b)
	{
		int i;
		for (i = 0;i < n2;i++)
		{
			a[n1 + i] = b[i];
		}
	}
	public static void pri(int n1, int n2, int[] a)
	{
		int i;
		for (i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n1 + n2 - 1]);
	}





}

