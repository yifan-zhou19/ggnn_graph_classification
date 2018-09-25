public class book
{
	public int a;
	public String b = new String(new char[30]);
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
		int k;
		int mid;
		int l = 0;
		int[] d = new int[26];
		int[] e = new int[26];
		final String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		book head;
		book p1;
		book p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (book)malloc(LEN);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.b = tempVar3.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
			p2.next = p1;
			p2 = p1;
		}
		p1 = head;
		for (j = 0;j < 26;j++)
		{
			p1 = head;
			l = 0;
			for (i = 0;i < m;i++)
			{
				for (k = 0;k < p1.b.length();k++)
				{
					if (p1.b.charAt(k) == c.charAt(j))
					{
						l++;
					}
				}
				d[j] = l;
				e[j] = l;
				p1 = p1.next;
			}
		}
		for (i = 0;i < 25;i++)
		{
		for (j = 0;j < 25 - i;j++)
		{
			if (d[j] < d[j + 1])
			{
				mid = d[j];
				d[j] = d[j + 1];
				d[j + 1] = mid;
			}
		}
		}
		for (i = 0;i < 26;i++)
		{
		if (e[i] == d[0])
		{
			break;
		}
		}
		System.out.printf("%c\n",c.charAt(i));
		System.out.printf("%d\n",d[0]);
		p1 = head;
		for (j = 0;j < m;j++)
		{
			for (k = 0;k < p1.b.length();k++)
			{
				if (p1.b.charAt(k) == c.charAt(i))
				{
					System.out.printf("%d\n",p1.a);
				}
			}
			p1 = p1.next;
		}





	}

}

