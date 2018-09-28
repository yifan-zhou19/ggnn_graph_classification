package <missing>;

public class GlobalMembers
{
	public static int josafe(int n,int m)
	{
	  int[] jo = new int[1000];
	  int i;
	  int j;
	  int count;
	  int s;
	  for (i = 0;i < n;i++)
	  {
	   jo[i] = 1;
	  }
	  j = -1;
	  for (i = 1;i <= n - 1;i++)
	  {
		  count = 0;
	   while (count < m)
	   {
			j = (j + 1) % n;
		 count = count + jo[j];
	   }
		jo[j] = 0;
	  }
	 for (i = 0;i < n;i++)
	 {
	   if (jo[i] == 1)
	   {
		   s = i + 1;
	   break;
	   }
	 }
	  return (s);
	}
	public static void Main()
	{
	 int i;
	 int[] a = new int[1000];
	 int[] b = new int[1000];
	 int j;
	 int[] c = new int[1000];
	 for (i = 0;;i++)
	 {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
	  if (a[i] == 0 && b[i] == 0)
	  {
	   break;
	  }
	  else
	  {
		  c[i] = josafe(a[i], b[i]);
	  }
	 }
	 for (j = 0;j < i;j++)
	 {
	  System.out.printf("%d\n",c[j]);
	 }
	}









}

