package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int k = 0;
	   double[] a = new double[100];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		a[i] = i;
		if (i % 7 == 0)
		{
		 a[i] = 0;
		 continue;
		}
		else if (i % 10 == 7)
		{
		 a[i] = 0;
		 continue;
		}
		else if (i <= 79 && i >= 70)
		{
		 a[i] = 0;
		 continue;
		}
	   }
	   for (i = 1;i <= n;i++)
	   {

		k = k + Math.pow(a[i],2);
	   }
	   (int)k;
	   System.out.print(k);
	   System.out.print("\n");
	   return 0;
	}
}

