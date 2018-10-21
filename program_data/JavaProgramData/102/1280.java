package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int h;
		  int j;
		  int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] e = new int[10000];
		  for (i = 0;i < n;i++)
		  {
		  e[i] = 0;
		  }
		  double[] a = new double[10000];
		  double f;
		  String b = new String(new char[1000]);
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  if (b.charAt(0) == 'm')
		  {
		  e[i]++;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Double.parseDouble(tempVar3);
		  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
		  for (j = 0;j < n - 1;j++)
		  {
		  if (a[j] > a[j + 1])
		  {
						 f = a[j];
						 a[j] = a[j + 1];
						 a[j + 1] = f;
						 c = e[j];
						 e[j] = e[j + 1];
						 e[j + 1] = c;
		  }
		  }
		  }
		  for (i = 0,h = 0;i < n;i++)
		  {
		  if (e[i] == 1)
		  {
		  if (h == 0)
		  {
		  h++;
		  System.out.printf("%.2lf",a[i]);
		  }
		  else
		  {
		  System.out.printf(" %.2lf",a[i]);
		  }
		  }
		  }
		  for (i = n - 1;i >= 0;i--)
		  {
		  if (e[i] == 0)
		  {
		  System.out.printf(" %.2lf",a[i]);
		  }
		  }
	}
}

