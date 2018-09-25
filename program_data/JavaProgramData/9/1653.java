public class seqs //????
{
	public String id = new String(new char[11]);
	public int age;
	public seqs next;
}
		p = head,j = 0;

package <missing>;

public class GlobalMembers
{
	public static int old = 0;


	public static seqs build(int l) //?????????l
	{
		int i;
		seqs head;
		seqs newnode;
		seqs p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (seqs)malloc(len); //???????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			head.age = Integer.parseInt(tempVar2);
		}
		p = head; //???p??????
		if (head.age >= 60)
		{
			old++;
		}
		for (i = 1;i < l;i++) //???????????????????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			newnode = (seqs)malloc(len); //?????
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				newnode.id = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				newnode.age = Integer.parseInt(tempVar4);
			}
			if (newnode.age < 60)
			{
				p.next = newnode; //??????????
				p = newnode; //???p??????
			}
			else
			{
				old++;
				newnode.next = head;
				head = newnode;
			}
		}
		p.next = null; //????????
		return head;
	}

	public static seqs rebuild(seqs headx) //????
	{
		int i;
		seqs head;
		seqs newnode;
		seqs p;
		seqs px;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		newnode = (seqs)malloc(len);
		newnode.next = null; //????????
		newnode.id = headx.id;
		newnode.age = headx.age; //????????????
		p = newnode; //???p?????????
		px = headx.next;
		for (i = 1;i < old;i++) //???????????????????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			newnode = (seqs)malloc(len); //?????
			newnode.id = px.id;
			newnode.age = px.age;
			newnode.next = p; //??????????
			p = newnode; //???p??????
			px = px.next;
		}
		head = p; //??head
		return head;
	}
	public static void bubble(seqs head, int l)
	{
		seqs p;
		int i;
		int j;
		int temp;
		char[] t = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = 1;i < l;i++)
		{
			for (p = head,j = 0;j < l - i;j++,p = p.next)
			{
				if (p.age < p.next.age)
				{
					t = p.id;
					p.id = p.next.id;
					p.next.id = t;
					temp = p.age;
					 p.age = p.next.age;
					p.next.age = temp;
				}
			}
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		seqs p;
		seqs px;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = build(n);
		px = rebuild(p);
		bubble(px, old);
		while (px != null) //????
		{
			System.out.printf("%s\n",px.id);
			px = px.next;
		}
		for (i = 0;i < old;i++)
		{
			p = p.next;
		}
		while (p != null) //????
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}


	}
}

