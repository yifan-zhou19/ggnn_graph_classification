public class word
{
	public String a = new String(new char[40]);
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   word[] dd = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   dd[i].a = tempVar2.charAt(0);
		   }
			dd[i].b = String.valueOf(dd[i].a).length();
	   }
	   int max = dd[0].b;
	   int x = 0;
	   int min = dd[0].b;
	   int y = 0;
	   for (i = 0;i < n;i++)

	   {
		   if (dd[i].b > max)
		   {
			   max = dd[i].b;
			   x = i;
		   }
		   if (dd[i].b < min)
		   {
			   min = dd[i].b;
			   y = i;
		   }
	   }
	   System.out.printf("%s\n%s",dd[x].a,dd[y].a);
	/*printf("%d %d ",max,min);*/
		return 0;
	}
}

