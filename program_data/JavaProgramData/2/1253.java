public class book
{
	public int num;
	public String name = new String(new char[100]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int n)
	{
		int k = 1;
		book head;
		book p1;
		book p2;
		book p;
		p1 = new book();
		head = p1;
		p2 = p1;
		p = p1;
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
		p1.next = null;
		do
		{
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
			p1.next = null;
			k++;
		}while (k < n);
		return head;
	}

	public static int Main()
	{
		book head;
		book p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s;
		int s;
		int n;
		int i;
		int j;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 26;i++)
		{
			*(s + i) = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		while (p != null)
		{
			q = p.name;
			while (*q != '\0')
			{
				*(s + *(q) - 'A') += 1;
				q++;
			}
			p = p.next;
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (*(s + i) > max)
			{
				max = (s + i);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (*(s + i) == max)
			{
				break;
			}
		}
		System.out.printf("%c\n%d\n",'A' + i,max);
		p = head;
		while (p != null)
		{
			q = p.name;
			if (tangible.StringFunctions.strChr(q,'A' + i) != null)
			{
				System.out.printf("%d\n",p.num);
			}
			p = p.next;
		}
	}



}

