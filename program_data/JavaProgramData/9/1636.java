public class student
{
	public String num = new String(new char[30]);
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		student p1;
		student p2;
		student p3;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new student();
			if (i == 0)
			{
				head = p1;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.sum = Integer.parseInt(tempVar3);
			}
			p1.next = null;


			if (i != 0)
			{
				p3 = head;
				if (p1.sum >= 60)
				{

					while ((p1.sum <= p3.sum) && p3.next != null)
					{
					p2 = p3;
					p3 = p3.next;
					}
				if (p1.sum > p3.sum)
				{
					 if (head == p3)
					 {
						 head = p1;
						 p1.next = p3;
					 }
					 else
					 {
						p2.next = p1;
						p1.next = p3;
					 }
				}
				else
				{
					p3.next = p1;
					p1.next = null;
				}
				}
				else
				{
					for (p2 = head;;p2 = p2.next)
					{
						if (p2.next == null)
						{
							break;
						}
					}
					p2.next = p1;
					p1.next = null;
				}
			}



		}
		p1 = head;
		for (i = 0;(i < n && p1 != null);i++)
		{
			System.out.printf("%s\n",p1.num);
			p1 = p1.next;
		}
	}

}

