public class stu
{
 public String name = new String(new char[20]);
 public int qm;
 public int bj;
 public char bgb;
 public char xb;
 public int lw;
 public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int max = 0;
		 int SUM = 0;
			   stu[] xs = tangible.Arrays.initializeWithDefaultstuInstances(100);
			   stu b = new stu();
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
					 xs[i].name = tempVar2.charAt(0);
				 }
				 System.in.read();
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 xs[i].qm = Integer.parseInt(tempVar3);
				 }
				 String tempVar4 = ConsoleInput.scanfRead(" ");
				 if (tempVar4 != null)
				 {
					 xs[i].bj = Integer.parseInt(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
				 if (tempVar5 != null)
				 {
					 xs[i].bgb = tempVar5.charAt(0);
				 }
				 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
				 if (tempVar6 != null)
				 {
					 xs[i].xb = tempVar6.charAt(0);
				 }
				 String tempVar7 = ConsoleInput.scanfRead(" ");
				 if (tempVar7 != null)
				 {
					 xs[i].lw = Integer.parseInt(tempVar7);
				 }
				 xs[i].sum = 0;
				 if (xs[i].qm > 80 && xs[i].lw > 0)
				 {
					 xs[i].sum = xs[i].sum + 8000;
				 }
				 if (xs[i].qm > 85 && xs[i].bj > 80)
				 {
					 xs[i].sum += 4000;
				 }
			if (xs[i].qm > 90)
			{
			xs[i].sum += 2000;
			}
			if (xs[i].qm > 85 && xs[i].xb == 'Y')
			{
			xs[i].sum += 1000;
			}
			if (xs[i].bj > 80 && xs[i].bgb == 'Y')
			{
			xs[i].sum += 850;
			}
			SUM += xs[i].sum;
			if (xs[i].sum > max)
			{
				max = xs[i].sum;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=xs[i];
				b.copyFrom(xs[i]);
			}
			   }
		System.out.printf("%s\n%d\n%d",b.name,max,SUM);
		return 0;
	}
}

