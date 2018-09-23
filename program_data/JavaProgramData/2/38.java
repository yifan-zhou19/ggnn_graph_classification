public class book
{
	public int num;
	public String name;
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book p1;
		book p2;
		book head;
		p1 = len;
		head = p1;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1.name = (String)malloc(26 * 1);
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
			p2 = len;
			p1.next = p2;
			p1 = p2;
		}
		p1 = p2 = head;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(26 * 4);
		for (i = 0;i < 26;i++)
		{
			*(a + i) = 0;
		}
		int j;
		int l;
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (*(p1.name.Substring(j)) != '\0')
			{
				l = (p1.name.Substring(j)) - 'A';
				*(a + l) += 1;
				j += 1;
			}
			p1 = p1.next;
		}
		int max = 0;
		int maxl;
		for (i = 0;i < 26;i++)
		{
			if (*(a + i) > max)
			{
				max = (a + i);
				maxl = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",maxl,max);
		p1 = p2 = head;
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (*(p1.name.Substring(j)) != '\0')
			{
				if (*(p1.name.Substring(j)) == maxl)
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
				j += 1;
			}
			p1 = p1.next;
		}
	}
}

