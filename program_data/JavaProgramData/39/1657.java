public class sch
{
	public String name = new String(new char[21]);
	public int finalg;
	public int classg;
	public char leader;
	public char west;
	public int paper;
	public int tot;
}

package <missing>;

public class GlobalMembers
{
	public static int TOTAL = 0;

	public static int money(sch stu)
	{
		stu.tot = 0;
		if (stu.finalg > 80)
		{
			if (stu.paper >= 1)
			{
				stu.tot += yuanshi;
			}
		  if (stu.finalg > 85)
		  {
			  if (stu.classg > 80)
			  {
				  stu.tot += wusi;
			  }
			  if (stu.west == 'Y')
			  {
				  stu.tot += xibu;
			  }
			  if (stu.finalg > 90)
			  {
				  stu.tot += chengyou;
			  }
		  }
		}
	   if ((stu.classg > 80) && (stu.leader == 'Y'))
	   {
		 stu.tot += bangong;
	   }
	   TOTAL += stu.tot;
	   return stu.tot;

	}

	public static void Main()
	{
		sch head;
		sch stu;
		int N;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		stu = (sch)malloc(LEN);
		head = stu;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stu.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			stu.finalg = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu.classg = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			stu.leader = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu.west = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu.paper = Integer.parseInt(tempVar7);
		}
		stu.tot = money(stu);
		for (i = 1;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			stu = (sch)malloc(LEN);
		  String tempVar8 = ConsoleInput.scanfRead();
		  if (tempVar8 != null)
		  {
			  stu.name = tempVar8.charAt(0);
		  }
		  String tempVar9 = ConsoleInput.scanfRead(" ");
		  if (tempVar9 != null)
		  {
			  stu.finalg = Integer.parseInt(tempVar9);
		  }
		  String tempVar10 = ConsoleInput.scanfRead(" ");
		  if (tempVar10 != null)
		  {
			  stu.classg = Integer.parseInt(tempVar10);
		  }
		  String tempVar11 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar11 != null)
		  {
			  stu.leader = tempVar11.charAt(0);
		  }
		  String tempVar12 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar12 != null)
		  {
			  stu.west = tempVar12.charAt(0);
		  }
		  String tempVar13 = ConsoleInput.scanfRead(" ");
		  if (tempVar13 != null)
		  {
			  stu.paper = Integer.parseInt(tempVar13);
		  }
		  stu.tot = money(stu);
		  if (stu.tot > head.tot)
		  {
			  head = stu;
		  }
		}
		System.out.printf("%s\n",head.name);
		System.out.printf("%d\n",head.tot);
		System.out.printf("%d\n",TOTAL);
	}



}

