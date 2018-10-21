package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int m;
		int n;
		int t;
		int i;
		int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  l = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  n = Integer.parseInt(tempVar3);
	  }
	   if (l % 4 == 0 && l % 100 != 0)
	   {
		   t = 29;
	   }
	   if (l % 4 != 0)
	   {
		   t = 28;
	   }
	   if (l % 100 == 0 && l % 400 != 0)
	   {
		  t = 28;
	   }
	   if (l % 400 == 0)
	   {
		   t = 29;
	   }
	   int[] a = {0, 31, t, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  if (m == 1)
		  {
			  s = n;
		  }
		  else
		  {
			s = n;
		  }
		 for (i = 1;i < m;i++)
		 {
			 s = s + a[i];
		 }
		 System.out.printf("%d",s);
		 return 0;
	}
}

