public class book
{
	public int name;
	public String writer = new String(new char[100]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];

	public static book creat(int n)
	{
		book p1;
		book p2;
		book xhead;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.writer = tempVar2.charAt(0);
		}
		p2 = p1;
		xhead = p1;

		while (n - 1 != 0)
		{
			n--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.name = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.writer = tempVar4.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return xhead;
	}


	public static void find(book head)
	{
		book p;
		int i;
		String s = new String(new char[100]);
		p = head;
		while (p != null)
		{
			i = 0;
			s = p.writer;
			while (s.charAt(i) != '\0')
			{
				a[s.charAt(i) - 'A']++;
				i++;
			}

			p = p.next;
		}
	}


	public static void print(book head, int max)
	{
		book p;
		p = head;
		while (p != null)
		{
			if (tangible.StringFunctions.strChr(p.writer,max + 'A'))
			{
				System.out.printf("%d\n",p.name);
			}
			p = p.next;
		}
	}




	public static void Main()
	{
		int i;
		int max = 0;
		int n;
		book head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		find(head);
		for (i = 0;i < 26;i++)
		{
			if (a[i] > a[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n",max + 'A');
		System.out.printf("%d\n",a[max]);
		print(head, max);
	}

}

