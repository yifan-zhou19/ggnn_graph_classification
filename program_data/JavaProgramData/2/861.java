public class book
{
	public int num;
	public String writer = new String(new char[20]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //c[26]???????????//
		int i;
		int j;
		int m;
		int k;
		int[] c = new int[26];
		int max;
		String a = new String(new char[26]); //a[26]??????//
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book p1;
		book p2;
		book head;
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(Len);
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.writer = tempVar3.charAt(0);
			}
		}
		p2.next = null;
		p1 = head;
		for (i = 0;i < 26;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, i + 65);
			c[i] = 0;
		}
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < 26;i++)
			{
				n = p1.writer.length();
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i) == p1.writer.charAt(k))
					{
						c[i]++;
					}
				}
			}
			p1 = p1.next;
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (c[i] > c[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",a.charAt(max),c[max]);
		p1 = head;
		for (i = 0;i < m;i++)
		{
			n = p1.writer.length();
			for (j = 0;j < n;j++)
			{
				if (p1.writer.charAt(j) == a.charAt(max))
				{
					System.out.printf("%d\n",p1.num);
				}
			}
			p1 = p1.next;
		}
		return 0;
	}
























}

