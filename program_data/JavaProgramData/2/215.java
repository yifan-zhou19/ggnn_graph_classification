public class book
{
	public String num = new String(new char[20]);
	public String aut = new String(new char[20]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static book creat()
	{
		book head;
		book p1;
		book p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.aut = tempVar2.charAt(0);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		for (i = 1;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.aut = tempVar4.charAt(0);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return (head);
	}
	public static void print(book head)
	{
		book p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tem,i,k;
		int tem;
		int i;
		int k;
		String q;
		char max;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tem = (int)malloc(30 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 30;i++)
		{
			*(tem + i) = 0;
		}
		for (p = head;p != null;p = p.next)
		{
			q = p.aut;
			for (i = 0; * (q.Substring(i)) != '\0';i++)
			{
				c = (q.Substring(i)) - 'A';
				*(tem + c) += 1;
			}
		}
		max = 0;
		k = 0;
		for (i = 0;i < 26;i++)
		{
			if (*(tem + i) > max)
			{
				max = (tem + i);
				k = i;
			}
		}
		c = k + 'A';
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",max);
		for (p = head;p != null;p = p.next)
		{
			for (q = p.aut,i = 0; * (q.Substring(i)) != '\0';i++)
			{
				if (*(q.Substring(i)) == c)
				{
					break;
				}
			}
			if (*(q.Substring(i)) != '\0')
			{
				System.out.printf("%s\n",p.num);
			}
		}
	}
	public static int Main()
	{
		book head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat();
		print(head);
	}

}

