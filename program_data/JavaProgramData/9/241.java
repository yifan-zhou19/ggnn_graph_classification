public class staff
{
	public String id = new String(new char[20]);
	public int age;
	public staff next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k = 0;
		int max = 59;
		staff head;
		staff p;
		staff q;
		staff pre;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		staff p1;
		staff p2;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (staff)malloc(LEN);
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
		head = p2 = p1;
		if (p1.age >= 60)
		{
			k++;
		}

		while (n - 1 != 0)
		{
			n--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (staff)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
			if (p1.age >= 60)
			{
				k++;
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;

		//printf("<%d>",k);

		while (k != 0)
		{
			p = head;
			k--;
			while (p != null)
			{
			  if (p.age > max)
			  {
				max = p.age;
				q = p;
			  }
			  p = p.next;
			}
			System.out.printf("%s\n",q.id);
			if (q == head)
			{
				head = q.next;
				q = null;
			}
			else
			{
				if (q.next == null)
				{
				  p = head;
				  while (p != null)
				  {
					  pre = p;
					  p = p.next;
					  if (p == q)
					  {
						q = null;
						pre.next = null;
						break;
					  }
				  }
				}

				else
				{
				  p = head;
				  while (p != null)
				  {
					pre = p;
					p = p.next;
					if (p == q)
					{
						p = p.next;
						pre.next = p;
						q = null;
						break;
					}
				  }
				}
			}
			max = 59;
		}

			p = head;
			while (p != null)
			{
				System.out.printf("%s\n",p.id);
				p = p.next;
			}
	}





}

