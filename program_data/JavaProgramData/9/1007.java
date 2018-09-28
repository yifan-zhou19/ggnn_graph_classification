public class stru
{
	public String id = new String(new char[20]);
	public int age;
	public stru next;
}

package <missing>;

public class GlobalMembers
{
	public static stru head;
	public static stru p;
	public static stru q;

	public static void creat(int N)
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (stru)malloc(LEN);
		head = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.age = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stru)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.id = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			q.next = p;
			q = p;
		}
		q.next = null;
	}

	public static void arrange(stru head, int N)
	{
		int i;
		int temp;
		String media = new String(new char[20]);
		for (i = 0;i < N;i++)
		{
			for (p = head,q = head.next;q != null;p = p.next,q = q.next)
			{
				if (q.age >= 60 && q.age > p.age)
				{
					media = p.id;
					p.id = q.id;
					q.id = media;
					temp = p.age;
					p.age = q.age;
					q.age = temp;
				}
			}
		}
	}


	public static void print(stru head)
	{
		for (p = head;p != null;p = p.next)
		{
			System.out.printf("%s\n",p.id);
		}
	}

	public static void Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		creat(N);
		//print(head);
		arrange(head, N);
		print(head);
	}




}

