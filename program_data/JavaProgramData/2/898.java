public class stu
{
	public int num;
public String name = new String(new char[27]);
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static stu creat()
	{
		int i = 0;
		stu head;
		stu p1;
		stu p2;
	head = p1 = p2 = new stu();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p2.num = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p2.name = tempVar2.charAt(0);
	}
	while (i < n - 1)
	{
		i++;
		p2 = new stu();
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p2.num = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		p2.name = tempVar4.charAt(0);
	}
	p1.next = p2;
	p1 = p2;
	}
	return head;
	}

	public static void Main()
	{
		stu p;
		stu head;
	int k;
	int u;
	int max = 0;
	int maxnum;
	int[] a = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	head = p = creat();
	for (k = 0;k < n;k++)
	{
					for (u = 0;p.name.charAt(u) != '\0';u++)
					{
					a[p.name.charAt(u) - 'A']++;
					}
				p = p.next;
	}
	for (k = 0;k < 26;k++)
	{
	if (a[k] > max)
	{
		max = a[k];
		maxnum = k;
	}
	}
	System.out.printf("%c\n%d\n",maxnum + 'A',max);
	p = head;
	for (k = 0;k < n;k++)
	{
	for (u = 0;p.name.charAt(u) != '\0';u++)
	{
	if (p.name.charAt(u) == maxnum + 'A')
	{
		System.out.printf("%d\n",p.num);
		break;
	}
	}
	p = p.next;
	}
	}

}

