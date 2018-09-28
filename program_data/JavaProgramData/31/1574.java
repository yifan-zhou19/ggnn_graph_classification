public class stu
{
	public String num = new String(new char[50]);
public String name = new String(new char[50]);
public char gentle;
public int age;
public int score;
public String add = new String(new char[50]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
		n = 0;
		p1 = p2 = new stu();
			 p1.num = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.num,"end") != 0)
		{
		n++;
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
		p1 = new stu();
		p1.num = new Scanner(System.in).nextLine();
		}
		return head;
	}
	public static void print(stu head)
	{
		stu p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
	}
	public static void Main()
	{
		stu head;
		head = creat();
		print(head);
	}

}
