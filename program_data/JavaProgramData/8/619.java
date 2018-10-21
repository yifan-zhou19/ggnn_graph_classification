package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void bubble(int a[],int k);
		void copy(int a[],int n,int b[],int m);
		void origin(int a[],int k);

		int[] x = new int[100];
		int[] y = new int[100];
		int n;
		int m;
		int i;
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
		//printf("%d",n);
		origin(x, n);
		origin(y, m);

		bubble(x, n);
		bubble(y, m);

		copy(x, n, y, m);

		return 0;
	}

	public static void origin(int[] a, int k)
	{
		int i;
		for (i = 0;i < k;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		//printf("%d",a[0]);
	}

	public static void bubble(int[] a, int k) //n?????????
	{
		int i;
		int temp;
		int j;
		for (j = 0;j < k - 1;j++) //???size-1?n-1???????10??????9???
		{
			for (i = 0;i < k - 1 - j;i++) //?????9-j???
			{
				if (a[i] > a[i + 1]) //?????????????????
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}

	public static void copy(int[] a, int n, int[] b, int m)
	{
		int[] c = new int[500];
		int i;
		int j;
		int up;
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (j = 0;j < m;j++,i++)
		{
			c[i] = b[j];
		}
		up = i;
		for (i = 0;i < up - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d",c[up - 1]);
	}




}

