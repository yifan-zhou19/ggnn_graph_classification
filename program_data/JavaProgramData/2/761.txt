public class author
{
	public String name = new String(new char[26]);
	public int num;
	public author next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[26];
		int j;
		int t;
		author head;
		author p1;
		author p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (author)malloc(LEN);
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.name = tempVar3.charAt(0);
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2 = p1;
			}
			if (i != (n - 1))
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = p2.next = (author)malloc(LEN);
			}
			else
			{
				p2.next = null;
			}
		}
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		p1 = head;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			for (j = 0;j < p1.name.length();j++)
			{
				a[p1.name.charAt(j) - 'A']++;
			}
		}
		t = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > a[t])
			{
				t = i;
			}
		}
		System.out.printf("%c\n%d\n",t + 'A',a[t]);
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			for (j = 0;j < p1.name.length();j++)
			{
				if (p1.name.charAt(j) == t + 'A')
				{
					System.out.printf("%d\n",p1.num);
				}
				continue;
			}
		}
	}


}

