public class books
{
	public int num;
	public String name = new String(new char[100]);
	public books next;
}

package <missing>;

public class GlobalMembers
{
	public static books create(int n)
	{
		books head;
		books p1;
		books p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (books)malloc(Len);
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
		head = p1;
		p2 = p1;
		while (--n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (books)malloc(Len);
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
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return head;
	}
	public static void Main()
	{
		int n;
		int i;
		int max;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] num = new int[26];
		char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		books p1;
		books head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		p1 = head;
		for (i = 0;i < 26;i++)
		{
			p1 = head;
			p = p1.name;
			do
			{

				if (*p == name[i])
				{
					num[i]++;
					p1 = p1.next;
					p = p1.name;
				}
				else
				{
					if (*p == '\0')
					{
						p1 = p1.next;
						p = p1.name;
					}
					else
					{
						p++;
					}
				}
			}while (p1 != null);
		}
		max = num[0];
		for (i = 0;i < 26;i++)
		{
			if (num[i] >= max)
			{
				k = i;
				max = num[i]; //???????num[i]??max??????max????????????25
			}
		}
		System.out.printf("%c\n",name[k]);
		System.out.printf("%d\n",num[k]);
		p1 = head;
		p = p1.name;
		while (p1 != null)
		{

			if (*p == name[k])
			{
				System.out.printf("%d\n",p1.num);
				p1 = p1.next;
				p = p1.name;
			}
			else
			{
				if (*p == '\0')
				{
					p1 = p1.next;
					p = p1.name;
				}
				else
				{
					p++;
				}
			}
		}
	}
}

