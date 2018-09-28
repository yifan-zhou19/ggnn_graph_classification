public class student
{
	public String con = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		student head;
		student p;
		student q;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (student)malloc(len);
		p.con = new Scanner(System.in).nextLine();
		head = null_Renamed;
		while (strcmp(p.con,"end") != 0)
		{
			//scanf("%s %c %d %d %s",p->name,&p->gender,&p->age,&p->score,p->add);
			n++;
			if (n == 1)
			{
				head = p,p.next = null_Renamed;
			}
			else
			{
				head = p,p.next = q;
			}
			q = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			p.con = new Scanner(System.in).nextLine();
		}
		return (head);
	}

	public static void print(student head)
	{
		student p;
		p = head;
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.con);
			p = p.next;
		}
	}

	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}
