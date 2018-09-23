public class book
{
	public int num;
	public String author = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat()
	{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int i = 1;
			book head;
			book p1;
			book p2;
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
				p1.author = tempVar3.charAt(0);
			}
			p1.next = null;
			if (i >= n)
			{
				p1 = null;
				head = null;
				return head;
			}
			else
			{
				head = p1;
			p2 = p1;
			while (i < n)
			{
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
				p1.author = tempVar5.charAt(0);
			}
			p1.next = null;
			i++;
			{
				p2.next = p1;
				p2 = p1;
			}
			}
			p2.next = p1;
			p1.next = null;
			return head;
			}
	}
	public static int max(char letter, book head)
	{
		int i;
		int j;
		int k;
		i = 0;
		book q;
		q = head;
		while (q != null)
		{
			k = q.author.length();
			for (j = 0;j < k;j++)
			{
				if ((q.author).charAt(j) == letter)
				{
					i++;
				}
			}
			q = q.next;
		}
		return i;
	}

	public static void outbook(char letter, book head)
	{
		int j;
		int k;
		book q;
		q = head;
		while (q != null)
		{
			k = q.author.length();
			for (j = 0;j < k;j++)
			{
				if ((q.author).charAt(j) == letter)
				{
					System.out.printf("%d\n",q.num);
				}
			}
			q = q.next;
		}
	}
	public static void Main()
	{
		int i;
		int m;
		int s;
		book p0;
		book p1;
		p0 = p1 = creat();
		int[] sum = new int[26];
		for (i = 0;i < 26;i++)
		{
			sum[i] = max(i + 65, p0);
		}
		s = 0;
		m = sum[0];
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > m)
			{
				m = sum[i];
				s = i;
			}
		}
		System.out.printf("%c\n",s + 65);
		System.out.printf("%d\n",m);
		outbook(s + 65, p1);
	}
}

