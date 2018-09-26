public class data
{
public String id = new String(new char[11]);
public int age;
public data next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k = 0;
		data p1;
		data p2;
		data head;
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

		for (i = n;i > n - k;i--)
		{
			head = sort(head, i);
		}
		print(head);
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
		System.out.printf("%s\n",code.id);

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

	public static void print(data head)
	{
		data p;
		p = head.next;
		do
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		} while (p != null);
	}
}

