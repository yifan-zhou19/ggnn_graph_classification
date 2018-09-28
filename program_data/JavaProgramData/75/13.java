package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[1000];
	 int i = 0;
	 int j = 0;
	 char d = ',';
	 while (d == ',')
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  d = tempVar2.charAt(0);
	  }
	  i++;
	 }
	 int n = i;
	 int max = 0;
	 int[] b = new int[n];
	 i = 0;
	 while (i < n)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  if (b[i] > max)
	  {
	   max = b[i];
	  }
	  i++;
	 }
	 int[] c = new int[max];
	 i = 0;
	 while (i < max)
	 {
	  c[i] = 0;
	  i++;
	 }
	 i = 0;
	 while (i < n)
	 {
	  j = a[i];
	  while (j < b[i])
	  {
	   c[j]++;
	   j++;
	  }
	  i++;
	 }
	 i = 0;
	 int m = 0;
	 while (i < max)
	 {
	  if (c[i] > m)
	  {
	   m = c[i];
	  }
	  i++;
	 }
	 System.out.printf("%d %d",n,m);
	}
}

