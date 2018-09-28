public class student
{
	 public String num = new String(new char[20]);
	 public String name = new String(new char[20]);
	 public char sex;
	 public int age;
	 public String score = new String(new char[10]);
	 public String add = new String(new char[30]);
	 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1;
	public static student p2;

	public static student input()
	{
		char[] temp = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		student head = null;

		while (gets(temp))
		{
			if (strcmp(temp,"end") == 0)
			{
				break;
			}
			p1 = new student();
			sscanf(temp,"%s%s %c %d %s%s",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);

			if (head == null)
			{
				head = p1,p2 = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
				p2.next = null;
			}
		}
		 return (head);
	}

	public static student sort(student head)
	{
	 student n;
	 student newhead = null;
		 do
		 {
			  p2 = null;
			  p1 = head;
			  while (p1.next != null)
			  {
				  p2 = p1,p1 = p1.next;
			  }
			  if (newhead == null)
			  {
			   newhead = p1,n = newhead.next = p2;
			  }
			  n = n.next = p2;
			  p2.next = null;
		 }while (head.next != null);

		 return (newhead);
	}

	public static void output(student outhead)
	{
		for (p1 = outhead;p1 != null;p1 = p1.next)
		{
			System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
		}
	}

	public static int Main()
	{
		 student head;
		 head = input();
		 head = sort(head);
		 output(head);
		 System.out.print("\n");
		 return 0;
	}

}
