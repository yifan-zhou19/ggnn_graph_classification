public class student
{
	public String temp = new String(new char[50]);
	public student previous;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student end;
		student head;
		student p1;
		student p2;
		student p;
	/*p1=(struct student *)malloc(LEN);*/
		p2 = head = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.temp = new Scanner(System.in).nextLine();
			if (strcmp(p1.temp,"end") == 0)
			{
					/*delete p1;*/
				break;
			}

			if (head == null)
			{
				head = p1;
				head.previous = null;
			}
			else
			{
				p1.previous = p2;
			}
			p2 = p1;
		}
	/*p1->previous=p2;*/
		p = p2;
		if (p != null)
		{
			while (p != null)
			{
				System.out.println(p.temp);
				p = p.previous;
			}
		}

	}
}
