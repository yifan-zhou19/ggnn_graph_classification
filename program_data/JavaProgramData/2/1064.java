public class book
{
	public int num;
	public String author = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		int l;
		int max;
		int maxi;
		int[] n = new int[26];
		book head;
		book p1;
		book p2;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
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
		head = null;
		while (i < m)
		{
			i++;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (i < m)
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
			}
		}
		p2.next = null;
		p1 = head;
		while (p1 != null)
		{
			l = p1.author.length();
			p = p1.author;
			for (i = 0;i < l;i++)
			{

				for (j = 0;j < 26;j++)
				{
					if (*(p.Substring(i)) == j + 64)
					{
						n[j]++;
					}
				}
			}
			p1 = p1.next;
		}
		max = n[0];
		for (i = 1;i < 26;i++)
		{
			if (n[i] > max)
			{
				max = n[i];
				maxi = i;
			}
		}
		System.out.printf("%c\n",maxi + 64);

		System.out.printf("%d\n",max);

		p1 = head;
		while (p1 != null)
		{
			l = p1.author.length();
			p = p1.author;
			for (i = 0;i < l;i++)
			{

					if (*(p.Substring(i)) == maxi + 64)
					{
						System.out.printf("%d\n",p1.num);
						break;
					}
			}
			p1 = p1.next;
		}
	}
}

