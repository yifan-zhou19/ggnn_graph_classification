public class student
 {
	 public String name = new String(new char[20]);
	 public int qm;
	 public int py;
	 public int gb;
	 public int xb;
	 public int paper;
	 public int sum;

 }

package <missing>;

public class GlobalMembers
{
	 public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	 public static void Main()
	 {
		 int n;
		 int i;
		 int k;
		 int max;
		 int s = 0;
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
				 stu[i].name = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 stu[i].qm = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 stu[i].py = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 stu[i].gb = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 stu[i].xb = Integer.parseInt(tempVar6);
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 stu[i].paper = Integer.parseInt(tempVar7);
			 }
			stu[i].sum = 0;
		   }
		 for (i = 0;i < n;i++)
		 {
			 if (stu[i].qm > 80 && stu[i].paper >= 1)
			 {
			 stu[i].sum = stu[i].sum + 8000;
			 }
			   if (stu[i].qm > 85 && stu[i].py > 80)
			   {
			 stu[i].sum = stu[i].sum + 4000;
			   }
				   if (stu[i].qm > 90)
				   {
					 stu[i].sum = stu[i].sum + 2000;
				   }
				   if (stu[i].qm > 85 && stu[i].xb == 'Y')
				   {
					  stu[i].sum = stu[i].sum + 1000;
				   }
				   if (stu[i].py > 80 && stu[i].gb == 'Y')
				   {
					 stu[i].sum = stu[i].sum + 850;
				   }
				   s = s + stu[i].sum;
		 }
		  max = stu[0].sum;
		  for (i = 0;i < n;i++)
		  {
			 if (max < stu[i + 1].sum)
			 {
			 max = stu[i + 1].sum;
			 }
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (stu[i].sum == max)
			   {
					System.out.printf("%s\n%d\n%d",stu[i].name,max,s);
					break;
			   }
		  }
	 }

}

