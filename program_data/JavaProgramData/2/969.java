public class wr
{
	public char w;
  public int k;
  public int[] num = new int[1000];
  public wr next;
}

package <missing>;

public class GlobalMembers
{
	public static wr creat()
	{
		wr head;
		wr p1;
		wr p2;
		wr a = new wr();
		char i;
		head = p2 = new wr();
		head.w = 'A';
		head.k = 0;
		for (i = 'B';i <= 'Z';i++)
		{
			p1 = new wr();
			p1.w = i;
			p1.k = 0;
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return head;
	}

	public static void add(char a, int b, wr head)
	{
		wr p;
		for (p = head;p != null;p = p.next)
		{
		if (a == p.w)
		{
			(p.k)++;
		  p.num[p.k - 1] = b;
		}
		}
	}

	public static void max(wr head)
	{
		wr p1;
		wr t = new wr();
		for (p1 = head.next;p1 != null;p1 = p1.next)
		{
			 if (p1.k > head.k)
			 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *head=*p1;
			 head.copyFrom(p1);
			 }
		}
	}

	public static void Main()
	{
		wr head;
		wr t;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *no;
		int no;
		int i;
		String ws;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		ws = (String)malloc((Character.SIZE / Byte.SIZE) * 27);
		head = creat();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				no = Integer.parseInt(tempVar2);
			}
			ws = new Scanner(System.in).nextLine();
			for (p = ws; * p != '\0';p++)
			{
				add(*p, no, head);
			}
		}
		max(head);
		System.out.printf("%c\n",head.w);
		System.out.printf("%d\n",head.k);
		for (i = 0;i < head.k;i++)
		{
			System.out.printf("%d\n",head.num[i]);
		}

	}
}

