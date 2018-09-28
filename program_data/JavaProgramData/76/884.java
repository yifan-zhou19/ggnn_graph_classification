public class qj
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static qj[] q = tangible.Arrays.initializeWithDefaultqjInstances(50001);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int z;
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
			  q[i].a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  q[i].b = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = n;i > 1;i--)
	  {
		  for (j = 0;j < i - 1;j++)
		  {
			  if (q[j].a > q[j + 1].a)
			  {
				  z = q[j + 1].a;
				  q[j + 1].a = q[j].a;
				  q[j].a = z;
				  z = q[j + 1].b;
				  q[j + 1].b = q[j].b;
				  q[j].b = z;
			  }
		  }
	  }
	  i = 0;
	  m = q[0].b;
	  while (i < n - 1)
	  {
		  if (m < q[i + 1].a)
		  {
			  System.out.print("no");
			  return 0;
		  }
		  else
		  {
			  if (q[i + 1].b > m)
			  {
				  m = q[i + 1].b;
			  }
		  }
		  i += 1;
	  }
	  System.out.printf("%d %d",q[0].a,m);
	  return 0;
	}
}

