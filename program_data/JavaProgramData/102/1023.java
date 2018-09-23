package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int ans = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int aa = 0;
	   int bb = 0;
	   double[] a = new double[10000];
	   double[] b = new double[10000];
	   for (int i = 1;i <= n;i++)
	   {
		   String s = new String(new char[100]);
		   double t;
		   s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   t = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  // cout<<s<<" "<<t;
		   if (s.charAt(0) == 'm')
		   {
			   aa++;
			   a[aa] = t;
		   }
		   else
		   {
			   bb++;
			   b[bb] = t;
		   }
	   }
	   sort(a + 1,a + aa + 1);
	   sort(b + 1,b + bb + 1);
	   for (int i = 1;i <= aa;i++)
	   {
		   System.out.printf("%.2f ",a[i]);
	   }
	   for (int i = bb;i >= 1;i--)
	   {
		   if (i != 1)
		   {
			   System.out.printf("%.2f ",b[i]);
		   }
		   else
		   {
			   System.out.printf("%.2f\n",b[i]);
		   }
	   }
	   //for (;;);
	}
}

