public class book
{
   public int num;
   public String w = new String(new char[26]);
   public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[26];
	public static int m;
	public static int i;
	public static int j = 0;
	public static int max;

	public static book creat(int m)
	{
		book head;
		book p1;
		book p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.w = tempVar2.charAt(0);
		}
		p1.next = null;
		p2 = p1;
		head = p1;
		for (i = 1;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.w = tempVar4.charAt(0);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return head;
	}
	public static void a(book head)
	{
		book p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * x;
		int l;
		int ch;
		p = head;
		for (i = 0;i < m;i++)
		{
			for (x = p.w;x < p.w.Substring(26);x++)
			{
				  l = (int) * x;
				  ch = l - 65;

				  if (ch >= 0)
				  {
					  c[ch] = c[ch] + 1;
				  }
			}
			p = p.next;
		}
	}

	public static void Main()
	{
		book head;
		book p;
		book creat = new book(int m);
		void a(struct book * head);
		char writer;
		String x;
		int wri;
		int[] b = new int[200];
		for (i = 0;i < 26;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < 200;i++)
		{
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		a(head);
		max = 0;
		j = 0;
		for (i = 0;i < 26;i++)
		{
			if (c[i] > max)
			{
			wri = i + 65;
			max = c[i];

			}
		}
		System.out.printf("%c\n",wri);
		p = head;
		for (i = 0;i < m;i++)
		{
			for (x = p.w;x < p.w.Substring(26);x++)
			{
				if (x == (char)wri)
				{
					b[j] = p.num;
					j = j + 1;
					break;
				}
			}
			p = p.next;
		}
	System.out.printf("%d\n",j);
	for (j = 0;b[j] > 0;j++)
	{
		System.out.printf("%d\n",b[j]);
	}



	}

}

