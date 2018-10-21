public class book
{
	public int num;
	public String author = new String(new char[30]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int max;
	public static int n;
	public static int x;
	public static int[] b = new int[30];

	public static book creat()
	{
		book head;
		book p1;
		book p2;
		p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (book)malloc(len);
		p1 = head;
		while (n > 0)
		{
			String a = new String(new char[30]);
			int i;
			int j;
			p2 = p1;
			x = 0;
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
			a = p1.author;
			max = b[0];
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				for (j = 'A';j <= 'Z';j++)
				{
					if (j == a.charAt(i))
					{
					b[j]++;
					}
				}
			}
			for (j = 'A';j <= 'Z';j++)
			{
				if (b[j] > max)
				{
					max = b[j];
					x = j;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(len);
			p2.next = p1;
			n--;
		}
		p2.next = null;
		System.out.printf("%c\n%d\n",x,max);
		return head;

	}
	public static book print(book head, char x)
	{
		book p1;
		p1 = head;
		int i;
		while (p1 != null)
		{
			String a = new String(new char[30]);
			a = p1.author;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == x)
				{
					System.out.printf("%d\n",p1.num);
				}
			}
			p1 = p1.next;
		}
		return head;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book head;
		head = creat();
		print(head, x);
	}


}

