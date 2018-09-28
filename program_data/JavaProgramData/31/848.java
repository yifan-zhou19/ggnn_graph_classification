public class stu
{
	   public String num = new String(new char[40]);
	   public String name = new String(new char[40]);
	   public String sex = new String(new char[10]);
	   public String year = new String(new char[10]);
	   public String score = new String(new char[40]);
	   public String add = new String(new char[40]);
	   public stu fw;
	   public stu bw;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu tail;
	public static stu create()
	{
		  int i;
		  stu head;
		  stu p1;
		  stu p2;
		  head = new stu();
		  head.fw = null;
		  head.bw = null;
		  p2 = head;
		  while (true)
		  {
				 p1 = new stu();
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 p1.num = tempVar.charAt(0);
				 }
				 if (strcmp(p1.num,"end") == 0)
				 {
					  p1.fw = null;
					  p2.fw = p1;
					  p1.bw = p2;
					  tail = p1;
					  break;
				 }
				 else
				 {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  p1.name = tempVar2.charAt(0);
					  }
					  String tempVar3 = ConsoleInput.scanfRead(" ");
					  if (tempVar3 != null)
					  {
						  p1.sex = tempVar3.charAt(0);
					  }
					  String tempVar4 = ConsoleInput.scanfRead(" ");
					  if (tempVar4 != null)
					  {
						  p1.year = tempVar4.charAt(0);
					  }
					  String tempVar5 = ConsoleInput.scanfRead(" ");
					  if (tempVar5 != null)
					  {
						  p1.score = tempVar5.charAt(0);
					  }
					  String tempVar6 = ConsoleInput.scanfRead(" ");
					  if (tempVar6 != null)
					  {
						  p1.add = tempVar6.charAt(0);
					  }
					  p1.fw = null;
					  p2.fw = p1;
					  p1.bw = p2;
					  p2 = p1;
				 }
		  }
		  return head;
	}
	public static void bwprint(stu ptail)
	{
		 stu p;
		 p = ptail.bw;
		 while (p.bw != null)
		 {

				System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.year,p.score,p.add);
				p = p.bw;
		 }

	}
	public static int Main()
	{
		 int k = 0;
		 stu p1;
		 stu pheader;
		 pheader = create();
		 bwprint(tail);

	}

}

