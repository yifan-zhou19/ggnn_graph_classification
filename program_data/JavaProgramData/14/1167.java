public class student
{
	public int number;
	public int yuwen;
	public int shuxue;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (student)malloc(LEN);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 p1.number = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p1.yuwen = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 p1.shuxue = Integer.parseInt(tempVar4);
	 }
	 p1.sum = p1.yuwen + p1.shuxue;
	 head = p1;
	 int i;
	 for (i = 1;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		p2.next = p1;
		p2 = p1;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.number = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.shuxue = Integer.parseInt(tempVar7);
		}
		p1.sum = p1.yuwen + p1.shuxue;
	 }
	 p2.next = null_Renamed;
	 return head;
	}
	public static void compare(student head)
	{
		int max;
		int i;
	 student p;
	 for (i = 1;i <= 3;i++)
	 {
			max = 0;
		 p = head;
		 while (p != null_Renamed)
		 {
				if (p.sum > max)
				{
					max = p.sum;
				}
			 p = p.next;
		 }
		 p = head;
		 while (p != null_Renamed)
		 {
				if (p.sum == max)
				{
					System.out.printf("%d %d\n",p.number,max);
				p.sum = 0;
				break;
				}
			 p = p.next;
		 }
	 }
	}
	public static int Main()
	{
		student head;
	 head = creat();
	 compare(head);
	}

}

