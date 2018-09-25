public class book
{
	public int num;
	public String writer = new String(new char[30]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static book creat()
	{
		book head;
		book p1;
		book p2;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.writer = tempVar2.charAt(0);
		}
		head = null;
		while (m < n - 1)
		{
			m++;
			if (m == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
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
				p1.writer = tempVar4.charAt(0);
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
			n = Integer.parseInt(tempVar);
		}
		book head;
		book p1;
		head = creat();
		book p;
		p = head;
		int i;
		int[] sum = new int[27];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		char m;
		for (p = head;p != null;p = p.next)
		{
			int x;
			for (i = 0;i < p.writer.length();i++)
			{
				x = p.writer.charAt(i) - 'A';
				sum[x]++;
			}
		}
		int max = sum[0];
		for (i = 0;i < 27;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
			}
		}
		for (i = 0;i < 27;i++)
		{
			if (sum[i] == max)
			{
				System.out.printf("%c\n%d\n",'A' + i,sum[i]);
				m = 'A' + i;
			}
		}
		for (p = head;p != null;p = p.next)
		{
			for (i = 0;i < p.writer.length();i++)
			{
				if (p.writer.charAt(i) == m)
				{
					System.out.printf("%d\n",p.num);
					break;
				}
			}
		}












	}
}

