public class student
{
	public String num = new String(new char[30]);
	public float chi;
	public float mat;
	public float tot;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(student head, student stud)
	{
		student p0;
		student p1;
		student p2;
		p1 = head;
		p0 = stud;
		if (head == null)
		{
			head = p0;
			p0.next = null;
		}
		else
		{
			while ((p0.tot <= p1.tot) && (p1.next != null))
			{
				p2 = p1;
				p1 = p1.next;
			}
		 if (p0.tot >= p1.tot)
		 {
			 if (head == p1)
			 {
				 head = p0;
			 }
		  else
		  {
			  p2.next = p0;
		  }
		  p0.next = p1;
		 }
		 else
		 {
			 p1.next = p0;
			 p0.next = null;
		 }
		}
		return (head);
	}

	public static student compare(student head, student stud)
	{
		student p0;
		student p1;
		student p2;
		int i;
		p1 = head;
		p0 = stud;
		while ((p0.tot <= p1.tot) && (p1.next != null))
		{
				p2 = p1;
				p1 = p1.next;
		}
		if ((p0.tot > p1.tot) || ((p0.tot = p1.tot) != 0 && (p1.next != null)))
		{
		  if (head == p1)
		  {
			  head = p0;
		  }
		  else
		  {
			  p2.next = p0;
		  }
		  p0.next = p1;
		  p1 = head;
		  for (i = 0;i < 2;i++)
		  {
			  p1 = p1.next;
		  }
		  p1.next = null;

		}

		return (head);
	}

	public static void print(student head)
	{
		student p;
		int i;
		p = head;
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%s %g\n",p.num,p.tot);
			p = p.next;
		}
	}

	public static void Main()
	{
		student head;
		student stu;
		int n;
		int i;
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 3;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			stu = (student)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu.chi = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu.mat = Float.parseFloat(tempVar4);
			}
			stu.tot = stu.chi + stu.mat;
			head = creat(head, stu);

		}
		for (i = 3;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			stu = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu.num = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu.chi = Float.parseFloat(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu.mat = Float.parseFloat(tempVar7);
			}
			stu.tot = stu.chi + stu.mat;
			head = compare(head, stu);

		}
		print(head);
	}

}

