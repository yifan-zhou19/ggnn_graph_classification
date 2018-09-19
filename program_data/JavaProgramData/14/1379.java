public class student
{
public int num;
public int yuwen;
public int shuxue;
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;

	public static void Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	student creat = new student(int n);
	void print(struct student * head,int n);

	student head;
	head = creat(n);
	print(head, n);
	print(head, n);
	print(head, n);
	}

	public static student creat(int n)
	{
	student head;
	student p1;
	student p2;
	m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(LEN);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.num = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p1.yuwen = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		p1.shuxue = Integer.parseInt(tempVar3);
	}
	head = null;
	for (;n != 0;n--)
	{
	 m += 1;
	 if (m == 1)
	 {
		 head = p1;
	 }
	 else
	 {
		 p2.next = p1;
	 }
	 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (student)malloc(LEN);
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 p1.num = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 p1.yuwen = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 p1.shuxue = Integer.parseInt(tempVar6);
	 }
	}
	p2.next = null;
	return (head);
	}


	public static void print(student head, int n)
	{
	student p;
	student q;
	p = head;
	int max = 0;
	int index = 0;
	for (;n != 0;n--)
	{
	 if (max < ((p.yuwen) + (p.shuxue)))
	 {
	 max = ((p.yuwen) + (p.shuxue));
	 index = p.num;
	 q = p;
	 }
	 p = p.next;
	}
	System.out.printf("%d %d\n",index,max);
	q.yuwen = 0;
	q.shuxue = 0;
	}
}

