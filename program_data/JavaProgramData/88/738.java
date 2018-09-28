package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String s = new String(new char[30]);
	  String ps;
	  int i;
	  int j;
	  int k;
	  int m;
	  int e;
	  int d;
	  int n;
	  int[] a = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * pa;
	  s = new Scanner(System.in).nextLine();
	  ps = s;
	  pa = a;
	  n = 0;
	  i = 0;
	  j = 0;
	  while (* (ps.Substring(i)) != '\0')
	  {
		  if ((*(ps.Substring(i)) >= '0') && (*(ps.Substring(i)) <= '9'))
		  {
	  j++;
		  }
	  else
	  {
		  if (j > 0)
		  {
		  d =  (ps.Substring(i) - 1) - 48;
	  k = 1;
	  while (k < j)
	  {
		  e = 1;
	  for (m = 1;m <= k;m++)
	  {
		  e = e * 10;
	  }
	  d = d + (* (ps.Substring(i) - 1 - k) - 48) * e;
	  k++;
	  }
	  *pa = d;
	  n++;
	  pa++;
	  j = 0;
		  }
	  }
	  i++;
	  }
	  if (j > 0)
	  {
		  d =  (ps.Substring(i) - 1) - 48;
	  k = 1;
	  while (k < j)
	  {
		  e = 1;
		  for (m = 1;m <= k;m++)
		  {
			  e = e * 10;
		  }
		  d = d + (* (ps.Substring(i) - 1 - k) - 48) * e;
		  k++;
	  }
	  *pa = d;
	  n++;
	  j = 0;
	  }
	  j = 0;
	  pa = a;
	  for (j = 0;j < n;j++)
	  {
	System.out.printf("%d\n",* (pa + j));
	  }
	}
}
