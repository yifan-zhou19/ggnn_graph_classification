package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		 int i;
		 int j;
		 int mark;
		 int b;
		 for (i = 0;i < n;i++)
		 {
			  mark = i;
			  for (j = i;j < n;j++)
			  {
					if (a[j] < a[mark])
					{
						mark = j;
					}
			  }
			  if (mark != i)
			  {
					b = a[i];
					a[i] = a[mark];
					a[mark] = b;
			  }
		 }
	}

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] a = new int[305];
		float aver = 0F;
		float x;
		float y;
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
			 aver += a[i];
		}
		aver /= n;
		sort(a, n);
		x = aver - a[0];
		y = a[n - 1] - aver;
		if (x - y > 0.01F)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < n;i++)
			{
				 if (a[i] == a[0])
				 {
					 System.out.printf(",%d",a[i]);
				 }
				 else
				 {
					 break;
				 }
			}
		}
		if (y - x > 0.01F)
		{
			for (i = 1;i < n;i++)
			{
				 if (a[i] == a[n - 1])
				 {
					  System.out.printf("%d",a[i]);
					  break;
				 }
			}
			if (i != n - 1)
			{
			for (i = i + 1;i < n;i++)
			{
				 if (a[i] == a[n - 1])
				 {
					 System.out.printf(",%d",a[i]);
				 }
			}
			}
		}
		if (Math.abs(x - y) < 1e-6)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < n;i++)
			{
				if (a[i] == a[0] || a[i] == a[n - 1])
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}

}

