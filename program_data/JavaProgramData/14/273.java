public class stu
{
	   public int id;
	   public int shu;
	   public int yu;
	   public int he;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int max;
		int sec;
		int th;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].id = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 stu[i].shu = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].yu = Integer.parseInt(tempVar4);
		 }
		 stu[i].he = stu[i].shu + stu[i].yu;
		}
		 max = 1;
		 for (i = 1;i < n;i++)
		 {
		   if (stu[max].he < stu[i + 1].he)
		   {
		   max = i + 1;
		   }
		 }
		   System.out.printf("%d %d\n",stu[max].id,stu[max].he);
			stu[max].he = 0;
			sec = 1;
		 for (i = 1;i < n;i++)
		 {
			 if (stu[sec].he < stu[i + 1].he)
			 {
			 sec = i + 1;
			 }
		 }
			  System.out.printf("%d %d\n",stu[sec].id,stu[sec].he);
			 stu[sec].he = 0;
			 th = 1;
			 for (i = 1;i < n;i++)
			 {
			   if (stu[th].he < stu[i + 1].he)
			   {
			   th = i + 1;
			   }
			 }
			   System.out.printf("%d %d\n",stu[th].id,stu[th].he);
			   System.in.read();
			   System.in.read();
	}


}

