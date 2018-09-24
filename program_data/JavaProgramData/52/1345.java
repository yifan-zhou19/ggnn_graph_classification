public class number
{
	public int num;
	public number next;
}

package <missing>;

public class GlobalMembers
{
	public static number creat(int n)
	{
		number head;
		number p1;
		number p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (number)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		head = p1;
		i = 1;
		while (i < n - 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (number)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			p2.next = p1;
			p2 = p1;
			i = i + 1;
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (number)malloc(LEN);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.num = Integer.parseInt(tempVar3);
		}
		p2.next = p1;
		p2 = p1;
		p2.next = head;
		return head;
	}
	public static void print(number head, int n, int m)
	{
		int i;
		number p;
		number t;
		p = head;
		for (i = 0;i < n - m;i++)
		{
			t = p;
			p = p.next;
		}
		t.next = null;
		if (p != null)
		{
		  do
		  {
			  System.out.printf("%d",p.num);
		  System.out.print((p.next != null)?" ":"\n");
		  p = p.next;
		  }while (p != null);
		}

	}


	public static void Main()
	{
		int n;
		int m;
		number p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		p = creat(n);
		print(p, n, m);
	}


}

