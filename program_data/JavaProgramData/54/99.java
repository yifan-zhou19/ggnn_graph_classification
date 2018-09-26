package <missing>;

public class GlobalMembers
{
	public static int undi(int n,int k,int p)
	{
		int z = p;
		int m = n;
	  while (m > 1)
	  {
		  if ((z * n + k) % (n - 1) == 0)
		  {
			m--;
		 z = (z * n + k) / (n - 1);
		  }
	   else
	   {
		   break;
	   }
	  }
	   if (m > 1)
	   {
		   z = 0;
	   }
	   else
	   {
		   z = z * n + k;
	   }
	   return (z);
	}

	public static void Main()
	{
		int n;
		int k;
		int p;
		int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (p = 1;;p++)
	 {
	  if (undi(n, k, p) != 0)
	  {
		break;
	  }
	 }
	 s = undi(n, k, p);
	 System.out.printf("%d",s);
	}
}

