package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] sz = new int[500];
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct
	// {
	//  int a;
	//  int s;
	// }
	// odd[250];
	 int n;
	 int[] a = new int[250];
	 int b = 0;
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
		  sz[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 0;i < 250;i++)
	 {
	  odd[i].a = 2 * i + 1;
	  odd[i].s = 0;
	 }
	for (i = 0;i < n;i++)
	{
	  if (sz[i] % 2 == 1)
	  {
	   odd[(sz[i] - 1) / 2].s = 1;
	  }
	}
	 for (i = 0;i < 250;i++)
	 {
	  if (odd[i].s == 1)
	  {
		  a[b] = odd[i].a;
		  b = b + 1;

	  }
	 }
	 for (i = 0;i < b - 1;i++)
	 {
		 System.out.printf("%d,",a[i]);
	 }
	 System.out.printf("%d",a[b - 1]);
	 return 0;
	}

}

