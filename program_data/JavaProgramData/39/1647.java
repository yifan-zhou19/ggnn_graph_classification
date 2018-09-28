public class stu
{

  public String name = new String(new char[20]);
  public int mark1;
  public int mark2;
  public char office;
  public char west;
  public int artical;
 public int money;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] student = tangible.Arrays.initializeWithDefaultstuInstances(120);
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m1;
		int m2;
		int a;
		char o;
		char w;
		int max;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		sum = 0;
		for (i = 1;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   student[i].name = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   m1 = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   m2 = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		   if (tempVar5 != null)
		   {
			   o = tempVar5.charAt(0);
		   }
		   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		   if (tempVar6 != null)
		   {
			   w = tempVar6.charAt(0);
		   }
		   String tempVar7 = ConsoleInput.scanfRead(" ");
		   if (tempVar7 != null)
		   {
			   a = Integer.parseInt(tempVar7);
		   }
		   student[i].money = 0;
		   if ((m1 > 80) && (a > 0))
		   {
			   student[i].money = student[i].money + 8000;
		   }
		   if ((m1 > 85) && (m2 > 80))
		   {
			   student[i].money = student[i].money + 4000;
		   }
		   if ((m1 > 90))
		   {
			   student[i].money = student[i].money + 2000;
		   }
		   if ((m1 > 85) && (w == 'Y'))
		   {
			   student[i].money = student[i].money + 1000;
		   }
		   if ((m2 > 80) && (o == 'Y'))
		   {
			   student[i].money = student[i].money + 850;
		   }
		   if (student[i].money > max)
		   {
			   max = student[i].money;
			   k = i;
		   }
		   sum = sum + student[i].money;
		}

		System.out.printf("%s\n",student[k].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);
	}
}

