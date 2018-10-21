public class student
{
  public String name = new String(new char[20]);
  public int s1;
  public int s2;
  public char g;
  public char x;
  public int m;
  public int sum;
}

package <missing>;

public class GlobalMembers
{
	 public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
	 int[] p = new int[100];
	 int i = 0;
	 int j = 0;
	 int n;
	 int h = 0;
	 int G = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	   stu[i].sum = 0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   stu[i].name = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   stu[i].s1 = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   stu[i].s2 = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   stu[i].g = tempVar5.charAt(0);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   stu[i].x = tempVar6.charAt(0);
	   }
	   String tempVar7 = ConsoleInput.scanfRead(" ");
	   if (tempVar7 != null)
	   {
		   stu[i].m = Integer.parseInt(tempVar7);
	   }
	   if (stu[i].s1 > 80 && stu[i].m >= 1)
	   {
		   stu[i].sum = stu[i].sum + 8000;
	   }
	   if (stu[i].s1 > 85 && stu[i].s2 > 80)
	   {
		   stu[i].sum = stu[i].sum + 4000;
	   }
	   if (stu[i].s1 > 90)
	   {
		   stu[i].sum = stu[i].sum + 2000;
	   }
	   if (stu[i].s1 > 85 && stu[i].x == 'Y')
	   {
		   stu[i].sum = stu[i].sum + 1000;
	   }
	   if (stu[i].s2 > 80 && stu[i].g == 'Y')
	   {
		   stu[i].sum = stu[i].sum + 850;
	   }
	   p[i] = stu[i].sum;
	   G = G + p[i];
	 }
	 for (j = 0;j < n - 1;j++)
	 {
	  for (i = 0;i < n - 1 - j;i++)
	  {
	   if (stu[i].sum > stu[i + 1].sum)
	   {
		 h = stu[i].sum;
		 stu[i].sum = stu[i + 1].sum;
		 stu[i + 1].sum = h;
	   }
	  }
	 }
	  for (i = 0;i < n;i++)
	  {
	   if (p[i] == stu[n - 1].sum)
	   {
		System.out.printf("%s\n%d\n%d\n",stu[i].name,p[i],G);
		break;
	   }
	  }
	}
}

