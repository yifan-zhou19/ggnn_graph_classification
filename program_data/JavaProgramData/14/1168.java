public class score
{
	public int num;
 public int yuwen;
 public int shuxue;
 public int total;
 public score next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static score creat()
	{
		score p1;
		score p2;
		score head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 head = p2 = (score)malloc(len);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p2.num = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p2.yuwen = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p2.shuxue = Integer.parseInt(tempVar3);
	 }
	 p2.total = p2.shuxue + p2.yuwen;
	 n--;
	 while (n-- != 0)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (score)malloc(len);
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 p1.num = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 p1.yuwen = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 p1.shuxue = Integer.parseInt(tempVar6);
		 }
		 p1.total = p1.shuxue + p1.yuwen;
		 p2.next = p1;
		 p2 = p1;
	 }
	 p2.next = null;
	 return head;
	}

	public static void search(score head)
	{
		score p;
		int i;
		int max;
	 for (i = 0;i < 3;i++)
	 {
			max = 0;
		 p = head;
		  while (p != null)
		  {
			if (p.total > max)
			{
				max = p.total;
			}
			p = p.next;
		  }
		 p = head;
		 while (p != null)
		 {
			 if (p.total == max)
			 {
				System.out.printf("%d %d\n",p.num,p.total);
			 p.total = 0;
			 break;
			 }
			 p = p.next;
		 }
	 }
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 score head;
	 head = creat();
	search(head);
	}
}

