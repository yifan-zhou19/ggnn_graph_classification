public class tushu
{
	public int num;
	public String name = new String(new char[26]);
	public tushu next;
}

package <missing>;

public class GlobalMembers
{
	public static tushu creat(int n)
	{
		tushu head;
		tushu p1;
		tushu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (tushu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = p1;
		int i;
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (tushu)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
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
	public static int Main()
	{
		int n;
		int[] num = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int max = 0;
		String a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		tushu head;
		tushu p1;
		head = creat(n);
		p = num;
		for (i = 0;i < 26;i++)
		{
			p1 = head;
			a = p1.name;
			while (p1 != null)
			{
				for (j = 0; * (a.Substring(j)) != '\0';j++)
				{
					   if (*(a.Substring(j)) == i + 65)
					   {
						*(p + i) = *(p + i) + 1;
						break;
					   }
				}
				p1 = p1.next;
				a = p1.name;
			}
		}
		for (i = 1;i < 26;i++)
		{
			if (*(p + max) < *(p + i))
			{
				max = i;
			}
		}
		System.out.printf("%c\n",max + 65);
		System.out.printf("%d\n",*(p + max));
		p1 = head;
		a = p1.name;
		while (p1 != null)
		{
			for (i = 0; * (a.Substring(i)) != '\0';i++)
			{
				if (*(a.Substring(i)) == (max + 65))
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
			p1 = p1.next;
			a = p1.name;
		}
	return 0;
	}

}

