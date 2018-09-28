package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int i;
		int k;
		int n;
		int m;
	 char c;
	 i = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[0] = Integer.parseInt(tempVar);
	 }
	 for (i = 1;;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar2 != null)
		 {
			 c = tempVar2.charAt(0);
		 }
	  if (c == '\n')
	  {
		  break;
	  }
	  else
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 k = a[0];
	 n = i;

		for (i = 0;i < n;i++)
		{
			  if (a[i] > k)
			  {
			k = a[i];
			  }
		}
	 m = 0;
		for (i = 0;i < n;i++)
		{
			  if (a[i] > m && a[i] < k)
			  {
			m = a[i];
			  }
		}
	if (m != 0)
	{
	  System.out.printf("%d",m);
	}
	else
	{
	 System.out.print("No");
	}
	}


}

