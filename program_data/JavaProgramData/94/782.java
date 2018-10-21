package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int j;
		int[] a = new int[500];
		int[] b = new int[500];
		void bubble(int a[],int n);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		bubble(a, n);


		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
		  System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j - 1]);

		return 0;

	}


	public static void bubble(int[] a, int n) //n?????????
	{
		int i;
		int temp;
		int j;
		for (j = 1;j < n;j++) //???size-1?n-1???????10??????9???
		{
			for (i = 0;i < n - j;i++) //?????9-j???
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

}

