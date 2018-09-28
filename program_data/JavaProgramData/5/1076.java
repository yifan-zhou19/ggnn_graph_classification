package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] a = new char[2][600];
	   double n;
	   double m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[0] = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[1] = tempVar3.charAt(0);
	   }
	   int i;
	   int s = 0;
	   m = String.valueOf(a[0]).length();
	   for (i = 0;i < m;i++)
	   {
		   if ((a[0][i] != 65 && a[0][i] != 67 && a[0][i] != 71 && a[0][i] != 84) || (a[1][i] != 65 && a[1][i] != 67 && a[1][i] != 71 && a[1][i] != 84))
		   {
			   System.out.print("error");
			   s = -1;
			   break;
		   }
		   else if (a[0][i] == a[1][i])
		   {
			   s++;
		   }
	   }

	   if (s != -1)
	   {
		double q;
		q = s * 1.0 / m;
		if (q >= n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	   }
		return 0;
	}
}

