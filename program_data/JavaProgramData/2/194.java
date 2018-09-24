public class book
{
	public int num;
	public String name = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int m)
	{
		book head;
		book p1;
		book p2;
		p1 = new book();
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
		int i;
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
			p1 = new book();
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
		p1.next = null;
		return (head);
	}
	public static int Main()
	{
		book head;
		book p;
		int i;
		int j;
		int m;
		int k;
		int l;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 26;i++)
		{
			*(a + i) = 0;
		}
		p = head;
		for (i = 0;i < m;i++)
		{
			k = p.name.length();
			for (j = 0;j < k;j++)
			{
				for (l = 0;l < 26;l++)
				{
					if (*(p.name.Substring(j)) == l + 65)
					{
						(*(a + l))++;
					}
				}
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (max < *(a + i))
			{
				max = (a + i);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max == *(a + i))
			{
			System.out.printf("%c\n%d\n",i + 65,max);
			break;
			}
		}
		p = head;
		for (j = 0;j < m;j++)
		{
			k = p.name.length();
			for (l = 0;l < k;l++)
			{
				if (*(p.name.Substring(l)) == i + 65)
				{
					System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}
	}
}

