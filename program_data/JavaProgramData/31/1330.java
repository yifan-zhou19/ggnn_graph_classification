public class student
{
	public String s = new String(new char[100]);
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
		p1 = p2 = (student)malloc(len);
		p1.s = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.s,"end") != 0)
		{
			n++;
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
			p1 = (student)malloc(len);
			p1.s = new Scanner(System.in).nextLine();
		}
		head.next = null;
		return (p2);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != 0)
		{
			do
			{
				System.out.printf("%s\n",p.s);
				p = p.next;
			}while (p != 0);
		}
	}
	public static int Main()
	{
		student p;
		p = creat();
		print(p);
	}


}
