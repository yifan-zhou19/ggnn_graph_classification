package <missing>;

public class GlobalMembers
{
	public static void input(int m, int n, int[] a, int[] b)
	{
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)

		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}

		}
			 for (j = 0;j < n;j++)
			 {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[j] = Integer.parseInt(tempVar4);
		}
			 }
	}
	public static void row(int[] a)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < 300;i++)
		{
			for (j = i + 1;j < 300;j++)
			{
				if ((a[j] < a[i]) && (a[j] != 0))
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
	}
	public static void com(int[] a, int[] b)
	{
		int i = 0;
		int j = 0;
		int k;
			   for (i = 0;i < 300;i++)
			   {
			   if (a[i] == 0)
			   {
						k = i;
						break;
			   }



			   }
		for (j = 0;j < 300;j++)
		{
				 if (b[j] != 0)
				 {

			a[k] = b[j];
				 }
			k++;

		}
	}
	public static void output(int[] a)
	{
		int i;
			 for (i = 0;i < 300;i++)
			 {
					if (a[i] != 0)
					{
				System.out.printf("%d",a[i]);
									break;
					}
			 }

			   i++;


		for (i;i < 300;i++)
		{
					if (a[i] != 0)
					{
				System.out.printf(" %d",a[i]);
					}

		}
	}

	public static void Main()
	{
	  int x;
	  int y;
	  int[] a = new int[300];
	  int[] b = new int[300];
	  input(x, y, a, b);
	  row(a);
	  row(b);
	  com(a, b);
	  output(a);
	}



}

