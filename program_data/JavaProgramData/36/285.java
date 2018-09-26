package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String a = new String(new char[1000]);
	   String b = new String(new char[1000]);
	   int i;
	   int j;
	   int m;
	   int n;
	   int k;
	   int q;
	   int p;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
	   m = a.length();
	   n = b.length();
	   if (m != n)
	   {
		   System.out.print("NO\n");
	   }
	   else
	   {
		  for (i = 0;i < m;i++)
		  {
			for (j = 0,p = 0;j < m;j++)
			{
			if (a.charAt(i) == a.charAt(j))
			{
				p++;
			}
			}
			for (k = 0,q = 0;k < n;k++)
			{
			if (a.charAt(i) == b.charAt(k))
			{
				q++;
			}
			}
			if (q != p)
			{
			  System.out.print("NO\n");
			  break;
			}
			else
			{
				t++;
			}
		  }
		  if (t == n)
		  {
			  System.out.print("YES\n");
		  }
	   }
	}
}

