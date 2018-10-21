public class student
{
	public String num = new String(new char[200]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
			student head;
			student p1;
			student p2;
			student newhead;
			student nnew;
			n = 0;
			p1 = p2 = new student();
			p1.num = new Scanner(System.in).nextLine();
			head = null;
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
				p1 = new student();
				p1.num = new Scanner(System.in).nextLine();
			}
			p2.next = null;
			for (i = 0;i < n;i++)
			{
				p2 = p1 = head;
				while (p1.next != null)
				{
					p2 = p1;
					p1 = p1.next;
				}
				if (i == 0)
				{
					newhead = nnew = p1;
				}
				else
				{
					nnew = nnew.next = p1;
				}
				p2.next = null;
			}
			p1 = newhead;
			for (i = 0;i < n;i++)
			{
				System.out.printf("%s",p1.num);
				p1 = p1.next;
				System.out.print("\n");
			}
	}


}
