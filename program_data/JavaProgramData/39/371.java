public class student
{
	public int a;
	public int b;
	public int paper;
	public int total;
  public char leader;
  public char west;
  public String name = new String(new char[32]);
  public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int sum = 0;
	   student p1;
	   student p2;
	   student head;
	   student max;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }




	   p2 = p1;
	   for (i = 0;i < n;i++)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (student)malloc(L);
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p1.name = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p1.a = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 p1.b = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar5 != null)
		 {
			 p1.leader = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar6 != null)
		 {
			 p1.west = tempVar6.charAt(0);
		 }
		 String tempVar7 = ConsoleInput.scanfRead(" ");
		 if (tempVar7 != null)
		 {
			 p1.paper = Integer.parseInt(tempVar7);
		 }
		 p1.total = 0;
		 if (p1.a > 80 && p1.paper >= 1)
		 {
			 p1.total = p1.total + 8000;
		 }
		 if (p1.a > 85 && p1.b > 80)
		 {
			 p1.total = p1.total + 4000;
		 }
		 if (p1.a > 90)
		 {
			 p1.total = p1.total + 2000;
		 }
		 if (p1.a > 85 && p1.west == 'Y')
		 {
			 p1.total = p1.total + 1000;
		 }
		 if (p1.b > 80 && p1.leader == 'Y')
		 {
			 p1.total = p1.total + 850;
		 }
		 sum = sum + p1.total;
		 if (i == 0)
		 {
			 max = p1;
			 p2 = head = p1;
			 head.next = null;
		 }
		 else
		 {
			 if (p1.total > max.total)
			 {
				 max = p1;
			 }
		 p2.next = p1;
		 p2 = p1;
		 p2.next = null;
		 }
	   }
	   System.out.printf("%s\n%d\n%d\n",max.name,max.total,sum);
	}

}

