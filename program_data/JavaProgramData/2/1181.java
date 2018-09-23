public class book
{
	public int num;
	public String name = new String(new char[20]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int n;
	public static int t;
	public static int[] number = new int[100];
	public static int m;
	public static book creat()
	{
		book p1;
		book p2;
		book head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = null;
		for (i = 1;i < m;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book creat = new book();
		book head;
		book p;
		int[] a = new int[26];
		int max;
		int maxindex = 0;
		head = p = creat();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pointer;
		do
		{
			for (pointer = p.name; * pointer != '\0';pointer++)
			{
				for (i = 0;i < 26;i++)
				{
					if (*pointer == 65 + i)
					{
						a[i]++;
					}
				}
			}
			p = p.next;
		}while (p != null);
		max = a[0];
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxindex = i;
			}
		}
		System.out.printf("%c\n%d\n",65 + maxindex,a[maxindex]);
		p = head;
		do
		{
			for (pointer = p.name; * pointer != '\0';pointer++)
			{
				if (*pointer == 65 + maxindex)
				{
					System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}while (p != null);
	}
}

