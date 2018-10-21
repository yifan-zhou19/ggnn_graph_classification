public class student
{
		   public int ID;
		   public int c;
		   public int m;
}

package <missing>;

public class GlobalMembers
{
	public static int pfCompare(Object elem1, Object elem2)
	{
		 int d;
		 d = (int)elem2 - (int)elem1;
		 return d;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[100000];
		int[] e = new int[3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	   for (i = 0;i < n;i++)
	   {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a[i].ID = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   a[i].c = Integer.parseInt(tempVar3);
					   }
					   String tempVar4 = ConsoleInput.scanfRead(" ");
					   if (tempVar4 != null)
					   {
						   a[i].m = Integer.parseInt(tempVar4);
					   }
	   }
	   for (i = 0;i < n;i++)
	   {
					   b[i] = a[i].c + a[i].m;
	   }
	   qsort(b,n,(Integer.SIZE / Byte.SIZE),pfCompare);
	   for (i = 0;i < n;i++)
	   {
					   if (b[0] == a[i].c + a[i].m)
					   {
											  e[0] = a[i].ID;
											   j = i;
											   break;
					   }
	   }
	  for (i = 0;i < n;i++)
	  {
					   if ((b[1] == a[i].c + a[i].m) && i != j)
					   {
													  e[1] = a[i].ID;
														 k = i;
														break;
					   }
	  }
	  for (i = 0;i < n;i++)
	  {
					   if ((b[2] == a[i].c + a[i].m) && i != j && i != k)
					   {
															e[2] = a[i].ID;
															 break;
					   }
	  }
	   for (i = 0;i <= 2;i++)
	   {
						System.out.printf("%d %d\n",e[i],b[i]);
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}
}

