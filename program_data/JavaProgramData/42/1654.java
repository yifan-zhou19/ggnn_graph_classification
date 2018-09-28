public class num
{
	public int a;
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int t = 0;
		num head;
		num p1;
		num p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (num) malloc(LEN);
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.a = Integer.parseInt(tempVar2);
		  }
		  if (i == 0)
		  {
			  head = p1;
		  }
		  else
		  {
			  p2.next = p1;
		  }
		  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (num) malloc(LEN);
		}
		p2.next = null;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p1 = head;
		p2 = p1;
		for (i = 0;i < n;i++)
		{
			if (p1.a != k)
			{
				p2 = p1;
				p1 = p1.next;
			}
			else
			{
				if (p1 == head)
				{
					head = p1.next;
					p1 = p1.next;
					p2 = p1;
				}
				else
				{
					p2.next = p1.next;
					p1 = p1.next;
				}
			}
		}
		p1 = head;
		while (p1 != null)
		{
			if (t == 0)
			{
				System.out.printf("%d",p1.a);
				t = 1;
			}
			else
			{
				System.out.printf(" %d",p1.a);
			}
			p1 = p1.next;
		}
		return 0;
	}


}

