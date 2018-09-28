package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[400];
	 int i = 0;
	 int j = 0;
	 int n = 0;
	 int t;
	 int x;
	 int y;
	 char c = ',';
	 while (c == ',')
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  i++;
	 }
	 n = i;
	 i = 2;
	 if (a[0] > a[1])
	 {
	  x = a[0],y = a[1];
	 }
	 else
	 {
	  if (a[0] == a[1])
	  {
	   x = a[1],y = 0;
	  }
	  else
	  {
	   x = a[1],y = a[0];
	  }
	 }
	 while (i < n)
	 {
	  if (a[i] > x)
	  {
	   y = x,x = a[i];
	  }
	  else
	  {
	   if (a[i] > y && a[i] != x)
	   {
		y = a[i];
	   }
	  }
	  i++;
	 }
	 if (x == y || n == 1 || y == 0)
	 {
	  System.out.print("No");
	 }
	 else
	 {
	  System.out.printf("%d",y);
	 }
	}
}

