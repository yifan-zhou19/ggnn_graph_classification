public class student
{
	public String num = new String(new char[10]);
public String name = new String(new char[20]);
public char fm;
public int age;
public int score;
public String add = new String(new char[50]);
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
	n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(LEN);
	p1.num = new Scanner(System.in).nextLine();
	head = null;
	while (strcmp(p1.num,"end") != 0)
	{
		n = n + 1;
	if (n == 1)
	{
		p1.next = null;
	}
	else
	{
		p1.next = p2;
	}
	p2 = p1;
	head = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);
	p1.num = new Scanner(System.in).nextLine();
	}

	return head;
	}

	public static int Main()
	{
		student head;
	student p1;
	student p2;
	student creat = new student();
	head = creat();
	void print(struct student * head);
	print(head);
	}

	public static void print(student head)
	{
		student p;
	p = head;
	if (head != null)
	{
	do
	{
		System.out.printf("%s\n",p.num);
	p = p.next;
	}while (p != null);
	}
	}

}
