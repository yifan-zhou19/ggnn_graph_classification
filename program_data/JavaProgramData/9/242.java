public class data
{
public String id = new String(new char[11]);
public int age;
public data next;
}

package <missing>;

public class GlobalMembers
{
	public static data p1;
	public static data p2;
	public static data head;
	public static data q1;
	public static data q2;
	public static data qhead;

	public static void Main()
	{
		int i;
		int n;
		int k = 0;
		data sort = new data(struct data * head,int n);
		void print(struct data * head);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (data)malloc(LEN);
		head.next = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (data)malloc(LEN);
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
			if ((p1.age) >= 60)
			{
				k++;
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		qhead = q1 = q2 = (data)malloc(LEN);
		qhead.next = null;
		for (i = n;i > n - k;i--)
		{
			head = sort(head, i);
		}
		q2.next = null;
		q2.next = head.next;
		head = null;
		print(qhead);
	}

	public static data sort(data head, int n)
	{
		int max = 59;
		int i;
		data p1;
		data p2;
		data code;
		data pre;
		p2 = head;
		p1 = head.next;
		for (i = 0;i < n;i++)
		{
			if ((p1.age) > max)
			{
				max = p1.age;
				code = p1;
				pre = p2;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q1 = (data)malloc(LEN);
		q1.id = code.id;
		q1.age = code.age;
		q2.next = q1;
		q2 = q1;

		if (pre == head)
		{
			head.next = code.next;
		}
		else
		{
			pre.next = code.next;
		}
		code = null;
		return (head);
	}

	public static void print(data qhead)
	{
		data q;
		q = qhead.next;
		do
		{
			System.out.printf("%s\n",q.id);
			q = q.next;
		} while (q != null);
	}

}

