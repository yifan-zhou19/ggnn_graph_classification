public class book
{
	public int num;
	public String edit = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static book head;
	public static book p1;
	public static book p2;

	public static book creat()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.edit = tempVar2.charAt(0);
		}
		head = p1;
		p2 = p1;
		m = m - 1;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.edit = tempVar4.charAt(0);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			m = m - 1;
		}while (m != 0);
		return (head);
	}


	public static void Main()
	{
		int max = 0;
		int i = 0;
		int j;
		int[] k = new int[26];
		book head;
		book p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat();
		for (p = head;p != null;)
		{
			for (i = 0;p.edit.charAt(i) != 0;i++)
			{
				k[(p.edit.charAt(i)) - 65] += 1;
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (k[i] > max)
			{
			max = k[i];
			j = i;
			}
		}
		System.out.printf("%c\n%d\n",j + 65,max);
		for (p = head;p != null;)
		{
			for (i = 0;p.edit.charAt(i) != 0;i++)
			{
				if (p.edit.charAt(i) == j + 65)
				{
					System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}

	}

}

