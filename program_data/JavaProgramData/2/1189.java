public class book
{
	public int num;
	public String au = new String(new char[30]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book p1;
		book p2;
		book head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.au = tempVar3.charAt(0);
		}
		p2 = p1;
		head = p1;
		int n = 1;
	while (n < m)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(LEN);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.num = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.au = tempVar5.charAt(0);
		}
		p2.next = p1;
		p2 = p1;
		n++;
	}
	p2.next = null;

	char maxa;
	char author;
	String temp = new String(new char[30]);
	int an;
	int maxn = 0;
	int i;
		book p;

	for (author = 'A';author <= 'Z';)
	{
			p = head;
		an = 0;
			while (p != null)
			{
				temp = p.au;


			for (i = 0;(temp.charAt(i)) != '\0';i++)
			{
			if (temp.charAt(i) == author)
			{
				an++;
				break;
			}
			}
			p = p.next;
			}
	if (an > maxn)
	{
			maxa = author;
			maxn = an;
	}
		author = author + 1;
	}
	System.out.printf("%c\n%d",maxa,maxn);
	p = head;
	while (p != null)
	{
		temp = p.au;
		for (i = 0;(temp.charAt(i)) != '\0';i++)
		{
			if (temp.charAt(i) == maxa)
			{
				System.out.print("\n");
				System.out.printf("%d",p.num);
				break;
			}
		}
		p = p.next;

	}



	}

}

