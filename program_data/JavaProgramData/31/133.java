public class student
{
	public String stu = new String(new char[100]);
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
		student toil;
		n = 0;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.stu = new Scanner(System.in).nextLine();
		while (strcmp(p1.stu,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.stu = new Scanner(System.in).nextLine();
		}
		toil = p2;
		head.next = null;
		return (toil);
	}

	public static void print(student toil)
	{
		student p;
		p = toil;
		if (toil != null)
		{
			do
			{
				System.out.printf("%s\n",p.stu);
				p = p.next;
			}while (p != null);
		}
	}

	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}




}
