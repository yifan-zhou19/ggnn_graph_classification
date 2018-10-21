public class pat
{
	public String id = new String(new char[30]);
	public int age;
	public int num;
	public int flag;
	public pat next;
	public pat ns;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void sort(pat head)
	{
		int i;
		int j;
		pat q;
		pat p;
		pat max;
		q = head;

		for (i = 0;i < n;i++)
		{
			p = head.next;
			while (true)
			{
				if (p.flag != 0)
				{
					break;
				}
				p = p.next;
			}
			max = p;
			while (true)
			{
				if ((p.num) > (max.num) && p.flag != 0)
				{
					max = p;
				}
				p = p.next;
				if (p == null)
				{
					break;
				}
			}
			max.flag = 0;
			q.ns = max;
			q = q.ns;

		}
		q.ns = null;
	}




	public static void Main()
	{
		int i;
		pat head;
		pat p1;
		pat p2;
		pat p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (pat)malloc(LEN);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (pat)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.age = Integer.parseInt(tempVar3);
			}
			p1.flag = 1;
			if (p1.age >= 60)
			{
				p1.num = 10000 * p1.age + n - i;
			}
			else
			{
				p1.num = n - i;
			}
			if (i == 0)
			{
				head.next = p1;
				p2 = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;

		sort(head);

		p = head.ns;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p.id);
			p = p.ns;
		}
	}
}

