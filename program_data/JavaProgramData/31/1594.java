public class student
	{
		public String num = new String(new char[100]);
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
			while (strcmp(p1.num,"end"))
			{
				n++;
				p1.next = head;
				head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
	p1.num = new Scanner(System.in).nextLine();
			}
			p1.next = null;
			return (head);
		}

		public static void print(student head)
		{
			student p;
			p = head;
			if (head != null)
			{
				do
				{
					System.out.println(p.num);
					p = p.next;
				} while (p != null);
			}
		}

		public static void Main()
		{
			student head;
			head = creat();
			print(head);
		}

}
