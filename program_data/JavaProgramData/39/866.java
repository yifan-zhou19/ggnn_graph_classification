public class Student
{
	public String name = new String(new char[20]);
	public int a;
	public int b;
	public char g;
	public char x;
	public int l;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100);
	public static int n;
	public static int Main()
	{
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   int all = 0;
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
			   stu[i].a = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   stu[i].b = Integer.parseInt(tempVar4);
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
			   stu[i].l = Integer.parseInt(tempVar7);
		   }
		   stu[i].sum = 0;
		   if (stu[i].a > 80 && stu[i].l >= 1)
		   {
			   stu[i].sum += 8000;
		   }
		   if (stu[i].a > 85 && stu[i].b > 80)
		   {
			   stu[i].sum += 4000;
		   }
		   if (stu[i].a > 90)
		   {
			   stu[i].sum += 2000;
		   }
		   if (stu[i].a > 85 && stu[i].x == 'Y')
		   {
			   stu[i].sum += 1000;
		   }
		   if (stu[i].b > 80 && stu[i].g == 'Y')
		   {
			   stu[i].sum += 850;
		   }
		   all += stu[i].sum;
	   }
	   int max = 0;
	   for (i = 0;i < n;i++)
	   {
		   if (max < stu[i].sum)
		   {
			   max = stu[i].sum;
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (stu[i].sum == max)
		   {
			   System.out.printf("%s\n",stu[i].name);
			   System.out.printf("%d\n",stu[i].sum);
			   break;
		   }
	   }
	   System.out.printf("%d\n",all);
	   return 0;
	}

}

