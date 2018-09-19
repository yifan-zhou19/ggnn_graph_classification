public class info
{
	public int num;
	public String author = new String(new char[30]);
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static info create(int n)
	{
	info p1;
	info p2;
	info head;
	int i;
	p1 = new info();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.num = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p1.author = tempVar2.charAt(0);
	}
	p1.next = null;
	p2 = p1;
	head = p1;
	i = 1;
	while (i < n)
	{
		p1 = new info();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.num = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.author = tempVar4.charAt(0);
		}
		p1.next = null;
		p2.next = p1;
		p2 = p1;
		i++;
	}
	return head;
	}



	public static int Main()
	{
		int n;
		int i;
		int t;
		int index;
		int j;
		info head;
		info p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *g;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		g = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		p = head;
		for (i = 0,t = 0;i < 26;i++)
		{
		*(g + i) = 0;
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (*(p.author.Substring(j)) != '\0')
			{
				(*(g + (*(p.author.Substring(j))) - 65))++;
				j++;
			}
			p = p.next;
		}
		for (i = 0,t = 0;i < 26;i++)
		{
		if (*(g + i) > t)
		{
			t = (g + i);
			index = i;
		}
		}
		System.out.printf("%c\n",index + 65);
		System.out.printf("%d\n",*(g + index));
		p = head;
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (*(p.author.Substring(j)) != '\0')
			{
				if (*(p.author.Substring(j)) == index + 65)
				{
				System.out.printf("%d\n",p.num);
				}
			j++;
			}
			p = p.next;
		}
	}
}

