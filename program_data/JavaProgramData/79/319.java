package <missing>;

public class GlobalMembers
{
	 public static int manage(int n,int q)
	 {
		int[] a = new int[1000];
		int i = 0;
		int[] p = a;
		int k = 0;
		int m = 0;
		int b;
		for (i = 0;i < n;i++)
		{
			p[i] = i + 1;
		}
		i = 0;

		while (m < n - 1)
		{
			if (p[i] != 0)
			{
				k++;
			}
			if (k == q)
			{
				p[i] = 0;
				k = 0;
				m++;
			}
			i++;
			if (i == n)
			{
				i = 0;
			}
		}

	  for (i = 0;i < n;i++)
	  {
		  if (p[i] != 0)
		  {
			  b = p[i];
		  }
	  }
	  return (b);



	 }

	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[1000];
		int i = 0;
		int j = 0;

	do
	{
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
		   if (n != 0)
		   {
				a[i] = manage(n, m);
				i++;
		   }
	} while (n != 0);

	  for (j = 0;j < i;j++)
	  {
		  System.out.printf("%d\n",a[j]);
	  }




	}
}

