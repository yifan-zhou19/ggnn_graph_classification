public class person
{
	public String sex = new String(new char[8]);
	public double hgt;
}

package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		if ((((person)b).hgt) - (((person)a).hgt) > 0)
		{
		return -1;
		}
		else
		{
		return 1;
		}
	}
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int m;
	  int n;
	  person[] a = tangible.Arrays.initializeWithDefaultpersonInstances(41);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i].sex = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  a[i].hgt = Double.parseDouble(tempVar3);
	  }
	  }
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  qsort(a,n,sizeof(person),compare);
	  for (i = 0,j = 0;i < n;i++)
	  {
	  for (i = 0,j = 0;i < n;i++)
	  {
		  if (a[i].sex.charAt(0) == 'm')
		  {
			  if (j == 0)
			  {
				  System.out.printf("%.2lf",a[i].hgt);
				  j = 1;
			  }
			  else
			  {
			  System.out.printf(" %.2lf",a[i].hgt);
			  }
		  }
	  }
	  }
	  for (i = n - 1;i >= 0;i--)
	  {
		  if (a[i].sex.charAt(0) == 'f')
		  {
		  System.out.printf(" %.2lf",a[i].hgt);
		  }
	  }
	}

}

