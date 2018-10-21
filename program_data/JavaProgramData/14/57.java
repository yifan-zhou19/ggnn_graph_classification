public class stu
{
 public int a;
 public int b;
 public int c;
 public int d;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int n;
	 int t;
	 stu[] p1;
	 stu p2 = new stu();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p1 = tangible.Arrays.initializeWithDefaultstuInstances(n);
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (p1[i].a) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (p1[i].b) = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 (p1[i].c) = Integer.parseInt(tempVar4);
		 }
		 p1[i].d = p1[i].b + p1[i].c;
	 }
	  for (i = 0;i < 3;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
		if (p1[i].d < p1[j].d)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p2=p1[i];
		  p2.copyFrom(p1[i]);
		  p1[i] = p1[j];
		  p1[j] = p2;
		}
	   }
	  }
	  for (i = 0;i < 3;i++)
	  {
	   System.out.printf("%d %d\n",p1[i].a,p1[i].d);
	  }
	}


}

