public class xs
{
	public String num = new String(new char[10]);
	public String name = new String(new char[30]);
	public String sex = new String(new char[2]);
	public String adr = new String(new char[100]);
	public String grade = new String(new char[20]);
	public int year;
	public xs next;
}

package <missing>;

public class GlobalMembers
{
	public static xs creat() // ?0?7?0?9�?0?0�?0?4 ?0?3?0?1 NULL ?0?4?0?1?0?7�?0?6?0?0?0?8?0?5?0?8�?0?8?0?1?0?0�
	{
		xs head;
		xs p1;
		xs p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (xs)malloc(LEN);
		head = null;
		p1.next = null;
		int n = 0;
	   while (true)
	   {
			n++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
				if (n == 1)
				{
					return null;
				}
				else
				{
					break;
				}
			}
			SCAN;
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
			p1 = (xs)malloc(LEN);
	   }
		p2.next = null;
		return head;
	}
	public static void output(xs head) //?0?8�?0?8?0?1?0?0�NULL ?0?8?0?1?0?6?0?2?0?3?0?1?0?6?0?8?0?3?0?5
	{
		xs p = head;
		if (p == null)
		{
			System.out.print("\n");
		}
		else
		{
			do
			{
		System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.sex,p.year,p.grade,p.adr);
		p = p.next;
			} while (p != null);
		}
	}
	public static xs change(xs head) //?0?8�?0?8?0?1?0?0� NULL ?0?3?0?1 NULL
	{
		xs p1;
		xs p2;
		xs p3;
		if (head == 0)
		{
			return 0;
		}
		p1 = null;
		p2 = head;
		p3 = p2.next;
		while (true)
		{
			 p2.next = p1;
			 if (p3 == null)
			 {

				 head = p2;
				 p2.next = p1;
				 break;
			 }
			 else
			 {
				 p1 = p2;
				 p2 = p3;
				 p3 = p3.next;
			 }

		}
		return head;
	}
	public static int Main()
	{
		xs head;
		head = creat();
		head = change(head);
		output(head);
		System.in.read();
		System.in.read();
		return 0;
	}

}

