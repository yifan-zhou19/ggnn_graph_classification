public class stu
{
	public String num = new String(new char[1000]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int m;
	public static int t;

	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(len);
		p1.num = new Scanner(System.in).nextLine();
		while (strcmp(p1.num,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(len);
			p1.num = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		return (head);
	}

	public static void print(stu head)
	{
		stu p1;
		stu p2;
		m = n;
		t = n;
		for (i = 1;n > 0;i++)
		{
			while (n > 0)
			{
				if (n == t)
				{
					p2 = p1 = head;
				}
				else
				{
					p2 = p1;
				}
				p1 = p1.next;
				n = n - 1;
			}
			System.out.printf("%s\n",p2.num);
			n = m - i;
			t = n;
		}
	}

	public static void Main()
	{
		stu head;
		head = creat();
		print(head);
	}





}
