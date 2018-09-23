public class student
{
  public int ID;
  public int chi;
  public int math;
}

package <missing>;

public class GlobalMembers
{
	public static student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		  int[] a = new int[n];
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 student[i].ID = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 student[i].chi = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 student[i].math = Integer.parseInt(tempVar4);
		 }
		  a[i] = student[i].chi + student[i].math;
	   }

	  for (k = 0;k < 3;k++)
	  {
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			  if (a[i] < a[j])
			  {
				 break;
			  }
		   }
		   if (j == n && a[i] >= a[j - 1])
		   {
			   System.out.printf("%d %d\n",student[i].ID,a[i]);
			   a[i] = 0;
			   break;
		   }
	   }
	  }
	   System.in.read();
	   System.in.read();
	}

}

