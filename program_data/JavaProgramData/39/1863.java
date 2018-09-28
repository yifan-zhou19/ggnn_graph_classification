public class student
{
	   public String name = new String(new char[20]);
	   public int scorefinal;
	   public int scoreclass;
	   public char gan;
	   public char xi;
	   public int lun;
	   public int money;
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int j;
		  int sum = 0;
		  int flag = 0;
		  student head;
		  student p1;
		  student p2;
		  student p5;
		  student p4;
		  student p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = p2 = (student)malloc(LEN);
		  p1.money = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.name = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  p1.scorefinal = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  p1.scoreclass = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  p1.gan = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  p1.xi = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  p1.lun = Integer.parseInt(tempVar7);
		  }
		  head = p1;
		  for (j = 0;j < n - 1;j++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
			  p1.money = 0;
			  p2.next = p1;
			  p2 = p1;
			  String tempVar8 = ConsoleInput.scanfRead();
			  if (tempVar8 != null)
			  {
				  p1.name = tempVar8.charAt(0);
			  }
			  String tempVar9 = ConsoleInput.scanfRead(" ");
			  if (tempVar9 != null)
			  {
				  p1.scorefinal = Integer.parseInt(tempVar9);
			  }
			  String tempVar10 = ConsoleInput.scanfRead(" ");
			  if (tempVar10 != null)
			  {
				  p1.scoreclass = Integer.parseInt(tempVar10);
			  }
			  String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar11 != null)
			  {
				  p1.gan = tempVar11.charAt(0);
			  }
			  String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar12 != null)
			  {
				  p1.xi = tempVar12.charAt(0);
			  }
			  String tempVar13 = ConsoleInput.scanfRead(" ");
			  if (tempVar13 != null)
			  {
				  p1.lun = Integer.parseInt(tempVar13);
			  }
		  }
		  p2.next = null;
		  p5 = head;
		  for (;p5 != null;p5 = p5.next)
		  {
			  if (p5.scorefinal > 80 && p5.lun >= 1)
			  {
				  p5.money = p5.money + 8000;
			  }
			  if (p5.scorefinal > 85 && p5.scoreclass > 80)
			  {
				  p5.money = p5.money + 4000;
			  }
			  if (p5.scorefinal > 90)
			  {
				  p5.money = p5.money + 2000;
			  }
			  if (p5.scorefinal > 85 && p5.xi == 'Y')
			  {
				  p5.money = p5.money + 1000;
			  }
			  if (p5.scoreclass > 80 && p5.gan == 'Y')
			  {
				  p5.money = p5.money + 850;
			  }
			  sum = sum + p5.money;
		  }
		  for (p4 = head;p4 != null;p4 = p4.next)
		  {
			  if (p4.money > flag)
			  {
				  flag = p4.money;
				  p = p4;
			  }
		  }
		  System.out.printf("%s\n%d\n%d",p.name,flag,sum);

	}
}

