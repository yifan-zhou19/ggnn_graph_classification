package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct student
	//  {
	//		 int ID;
	//		 int yuwen;
	//		 int shuxue;
	//  };
	  int n;
	  int i;
	  int x;
	  int y;
	  int z;
	  int o;
	  int p;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[100000];
	  student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   stu[i].ID = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   stu[i].yuwen = tempVar3;
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   stu[i].shuxue = tempVar4;
	   }
	   a[i] = stu[i].yuwen + stu[i].shuxue;
	  }
	  x = 0;
	  y = 1;
	  z = 2;
	   for (i = 0;i < 3;i++)
	   {
		if (a[i] >= a[0] != 0 && a[i] >= a[1] != 0 && a[i] >= a[2])
		{
		   x = i;
		   o = a[i];
		   continue;
		}
		if (a[i] <= a[0] != 0 && a[i] <= a[1] != 0 && a[i] <= a[2])
		{
		   z = i;
		   q = a[i];
		   continue;
		}
		y = i;
		p = a[i];
	   }

		for (i = 3;i < n;i++)
		{
		 if (a[i] > q)
		 {
		   if (a[i] > o)
		   {
			z = y;
			y = x;
			x = i;
			q = p;
			p = o;
			o = a[i];
		   }
		   else
		   {
			if (a[i] > p)
			{
			  z = y;
			  y = i;
			  q = p;
			  p = a[i];
			}
			else
			{
			  z = i;
			  q = a[i];
			}
		   }
		 }
		}
	   System.out.printf("%d %d\n",stu[x].ID,o);
		System.out.printf("%d %d\n",stu[y].ID,p);
		 System.out.printf("%d %d\n",stu[z].ID,q);
	 System.in.read();
	 System.in.read();
	}











}

