public class book
{
	public int num;
	public String name = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static book create()
	{
		book head;
		book p1;
		book p2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
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
			p1.name = tempVar3.charAt(0);
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.name = tempVar5.charAt(0);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static void Main()
	{
		int[] num = new int[26];
		int i;
		int j;
		int max = 0;
		book p1;
		book p2;
		book head;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p1 = create();
		head = p1;
		for (i = 0;i < m;i++)
		{
			for (p = p1.name; * p != '\0';p++)
			{
				num[(*p) - 'A']++;
			}
			p1 = p1.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				j = i;
			}
		}
		System.out.printf("%c\n",('A' + j));
		System.out.printf("%d\n",max);
		p1 = head;
		for (i = 0;i < m;i++)
		{
			p = p1.name;
			for (p = p1.name; * p != '\0';p++)
			{
				if (*p == ('A' + j))
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
			p1 = p1.next;
		}
	}
}

