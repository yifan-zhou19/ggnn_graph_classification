public class student
{
	   public int i;
	   public int j;
	   public int k;
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
		  student[] c = tangible.Arrays.initializeWithDefaultstudentInstances(n + 10);
		  int m1 = 1;
		  int m2 = 1;
		  int m3 = 1;
		  for (int m = 1;m <= n;m++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 c[m].i = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 c[m].j = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 c[m].k = Integer.parseInt(tempVar4);
			 }
		  if ((c[m].j + c[m].k) > (c[m1].j + c[m1].k))
		  {
			  m3 = m2;
			  m2 = m1;
			  m1 = m;
		  }
		  else if ((c[m].j + c[m].k) > (c[m2].j + c[m2].k))
		  {
			 m3 = m2;
			 m2 = m;
		  }
		  else if ((c[m].j + c[m].k) > (c[m3].j + c[m3].k))
		  {
		  m3 = m;
		  }
		  }
		  System.out.printf("%d %d\n",c[m1].i,c[m1].j + c[m1].k);
		  System.out.printf("%d %d\n",c[m2].i,c[m2].j + c[m2].k);
		  System.out.printf("%d %d\n",c[m3].i,c[m3].j + c[m3].k);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

