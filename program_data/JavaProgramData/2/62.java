public class a
{
	public int num;
	public String s = new String(new char[20]);
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[26];
		int[] b = new int[26];
		int t;
		int j;
		int max;

		a p1;
		a p2;
		a head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (a)malloc(L);
		scanf(M, p1.num, p1.s);
		for (i = 1;i < n;i++)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (a)malloc(L);
			p2.next = p1;
			scanf(M, p1.num, p1.s);
		}
		p1.next = null;
		for (i = 0;i < 26;i++)
		{
			a[i] = 65 + i;
		}
		for (i = 0;i < 26;i++)
		{
			p1 = head;
			while (p1 != null)
			{
				for (j = 0;p1.s.charAt(j) != '\0';j++)
				{
					if (a[i] == p1.s.charAt(j))
					{
						b[i]++;
					}
				}
					p1 = p1.next;
			}

		}
		max = b[0];
		t = 0;
		for (i = 1;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				t = i;
			}
		}
			System.out.printf("%c\n%d\n",a[t],max);
			p1 = head;
		while (p1 != null)
		{
			for (j = 0;p1.s.charAt(j) != '\0';j++)
			{
				if (a[t] == p1.s.charAt(j))
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
			p1 = p1.next;
		}
	}

}

