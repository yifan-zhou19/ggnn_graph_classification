public class book
{
	public int num;
	public String name = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int n)
	{
		int i;
		book head;
		book p1;
		book p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
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
		head = null;

		for (i = 0;i < n - 1;i++)
		{

			if (i == 0)
			{
				head = p1;
			}
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
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}

	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[26];
		int max = 0;
		int j;
		int k = 0;
		char t;
		book p;
		book p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		p1 = p;
		for (j = 0;j < n;j++)
		{
			for (i = 0; * (p.name.Substring(i)) != '\0';i++)
			{
				a[*(p.name.Substring(i)) - 65] = a[*(p.name.Substring(i)) - 65] + 1;
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",(k + 65),max);
		t = (char)(k + 65);

		while (p1 != null)
		{
			for (i = 0; * (p1.name.Substring(i)) != '\0';i++)
			{
				if (*(p1.name.Substring(i)) == t)
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
			p1 = p1.next;
		}
	}


}

