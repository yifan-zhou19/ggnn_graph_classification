public class book
{
	public int ID;
	public String author = new String(new char[30]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int max = 0;
	public static char c;

	public static book create()
	{
		book head;
		book p1;
		book p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.ID = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.author = tempVar2.charAt(0);
		}
		head = p1;
		p2 = p1;
		p1.next = null;

		int i = 1;
		do
		{
			if (i == n)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.ID = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.author = tempVar4.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
			p1.next = null;
			i++;
		}while (1 != 0);
		return (head);
	}





	public static int Main()
	{
		book head;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 26;i++)
		{
			*(num + i) = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create();
		book p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		p = head;
		while (p != null)
		{
			for (s = p.author; * s != '\0';s++)
			{
				int temp;
				temp = s - 'A';
				(*(num + temp))++;
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (*(num + i) > max)
			{
				max = (num + i);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (*(num + i) == max)
			{
				break;
			}
		}
		System.out.printf("%c\n%d\n",'A' + i,max);
		c = 'A' + i;
		p = head;
		while (p != null)
		{
			for (s = p.author; * s != '\0';s++)
			{
				if (*s == c)
				{
					break;
				}
			}
			if (*s != '\0')
			{
				System.out.printf("%d\n",p.ID);
			}
			p = p.next;
		}
	}



}

