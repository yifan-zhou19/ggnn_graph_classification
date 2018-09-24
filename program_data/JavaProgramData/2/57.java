public class chain
{
	public int num;
	public String name = new String(new char[27]);
	public chain next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int m;
		int i;
		int j;
		int k;
		int max = 0;
		int n;
		chain p1;
		chain p2;
		chain head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = head = (chain)malloc(LEN);
		for (k = 0;k < 27;k++)
		{
			head.name = head.name.substring(0, k);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			head.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			head.name = tempVar3.charAt(0);
		}
		for (k = 0;k < head.name.length();k++)
		{
				if (head.name.charAt(k) >= 65 && head.name.charAt(k) <= 90)
				{
						a[head.name.charAt(k) - 65]++;
				}
		}
		for (j = 0;j < m - 1;j++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (chain)malloc(LEN);
			p2.next = p1;
			for (k = 0;k < 27;k++)
			{
				p1.name = p1.name.substring(0, k);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.name = tempVar5.charAt(0);
			}
			p2 = p1;
			for (k = 0;k < p1.name.length();k++)
			{
				if (p1.name.charAt(k) >= 65 && p1.name.charAt(k) <= 90)
				{
						a[p1.name.charAt(k) - 65]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				n = i;
			}
		}
		System.out.printf("%c\n%d\n",n + 65,max);
		p1 = head;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (p1.name.charAt(j) == (n + 65))
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
			p1 = p1.next;
		}
	}
}

