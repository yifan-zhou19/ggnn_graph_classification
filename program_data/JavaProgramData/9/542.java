package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int i;
		int s;
		for (i = 1,s = a[1];i < n;i++)
		{
		 s = (s >= a[i])?s:a[i];
		}
		 return (s);
	}
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int n;
		int[] c = new int[200];
		int e;
		int t = 1;
		 char[][] b = new char[200][12];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 b[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 e = Integer.parseInt(tempVar3);
			 }
		   if (e >= 60)
		   {
			  a[i] = e;
		   }
		   else
		   {
			  c[i] = e;
		   }
		 }
		  for (;;)
		  {
			t = max(a, n);
		   if (t == 0)
		   {
			 break;
		   }
		  for (i = 1;i <= n;i++)
		  {
		  if (a[i] == t)
		  {
			 System.out.printf("%s\n",b[i]);
			  a[i] = 0;
		  }
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
		   if (c[i] != 0)
		   {
		   System.out.printf("%s\n",b[i]);
		   }
		  }


	}

}

