public class tushu
{
	public int num;
	public String name = new String(new char[20]);
	public tushu next;
}

package <missing>;

public class GlobalMembers
{
	public static tushu creat(int m)
	{
		tushu head;
		tushu p1;
		tushu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (tushu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = p1;
		int i;
		for (i = 2;i <= m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (tushu)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static int Main()
	{
		int m;
		int[] num = new int[26];
		int i;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		tushu head;
		tushu p1;
		head = creat(m);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * x;
		for (i = 0;i < 26;i++)
		{
			p1 = head;
			x = p1.name;
			while (p1 != null)
			{
				while (*x != '\0')
				{
					if (*x == (i + 65))
					{
						num[i] = num[i] + 1;
					}
					x = x + 1;
				}
				p1 = p1.next;
				x = p1.name;
			}
		}
		max = 0;
		for (i = 1;i < 26;i++)
		{
			if (num[max] < num[i])
			{
				max = i;
			}
		}
		System.out.printf("%c\n",max + 65);
		System.out.printf("%d\n",num[max]);
		p1 = head;
		x = p1.name;
		while (p1 != null)
		{
			while (*x != '\0')
			{
				if (*x == (max + 65))
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
				x = x + 1;
			}
			p1 = p1.next;
			x = p1.name;
		}
		return 0;
	}
}

