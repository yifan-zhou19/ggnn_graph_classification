public class book
{
	public int num;
	public String name = new String(new char[20]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static book p1;
	public static book p2;
	//????
	public static book creat()
	{
		book head;
		int i;
		head = null;
		p1 = null;
		p2 = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
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
			if (head == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		book head;
		book p;
		String a = new String(new char[27]);
		String q;
		char c;
		int[] b = new int[27]; //??a??????????b?????????????
		int i;
		int m;
		int n1 = 0;
		int max;
		for (i = 1;i < 27;i++)
		{
			a = a.substring(0, i);
			b[i] = 0;
		}
		head = creat();
		for (p = head;p != 0;p = p.next) //p++???p=p->next
		{
			for (q = p.name; q != '\0';q++)
			{
				m = 0;
				for (i = 1;i <= n1;i++) //???????????????????????????????????????1
				{
					if (q == a.charAt(i))
					{
						m = 1;
						b[i]++;
						break;
					}
				}
				if (m == 0)
				{
					n1++; //??n1???n
					a = tangible.StringFunctions.changeCharacter(a, n1, q);
					b[n1] = 1;
				}
			}
		}
		max = b[1];
		c = a.charAt(1);
		for (i = 1;i <= n1 - 1;i++)
		{
			if (b[i] > max)
			{
				c = a.charAt(i);
				max = b[i];
			}
		}
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",max);
		for (p = head;p != 0;p = p.next)
		{
			m = 0;
			for (q = p.name; q != '\0';q++)
			{
				if (q == c)
				{
					m = 1;
					break;
				}
			}
			if (m != 0)
			{
				System.out.printf("%d\n",p.num); //?????????
			}
		}
	}

}

