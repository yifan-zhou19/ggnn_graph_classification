package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void shuzu(int k,int a[10]);
		void zhao(int a[10],int b[10]);
		int n;
		int m;
		int[] a = new int[10];
		int[] b = new int[10];
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
		shuzu(m, a);
		shuzu(n, b);
		zhao(a, b);
	}

	public static void shuzu(int k, int[] a)
	{
		int i;
		a[0] = k;

		for (i = 1;i < 10;i++)
		{
		 if (k % 2 == 0)
		 {
			a[i] = k / 2;
		 }
		 else
		 {
			 a[i] = (k - 1) / 2;
		 }
		 k = a[i];
		}
	}
	public static void zhao(int[] a, int[] b)
	{
		int i;
		int j;
		int a0;
		int b0;
		for (i = 0;i < 10;i++)
		{
			if (a[i] == 1)
			{
				a0 = i;
			}
			if (b[i] == 1)
			{
				b0 = i;
			}
		}
		for (i = a0,j = b0;;i--,j--)
		{
			if (a[i] != b[j])
			{
				System.out.printf("%d\n",a[i + 1]);
			break;
			}
		}
	}
}

