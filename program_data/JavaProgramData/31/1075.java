public class seqs //????
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score; //???????
	public String addr = new String(new char[100]);
	public seqs next;
}

package <missing>;

public class GlobalMembers
{
	public static seqs build() //????
	{
		seqs head;
		seqs newnode;
		seqs p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		newnode = (seqs)malloc(len);
		newnode.next = null; //????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			newnode.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			newnode.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			newnode.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			newnode.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			newnode.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			newnode.addr = tempVar6.charAt(0);
		}
		p = newnode; //???p?????????

		while (true) //???????????????????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			newnode = (seqs)malloc(len); //?????
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				newnode.num = tempVar7.charAt(0);
			}
			if (newnode.num.charAt(0) == 'e')
			{
				break; //???????????
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				newnode.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				newnode.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				newnode.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				newnode.score = Float.parseFloat(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				newnode.addr = tempVar12.charAt(0);
			}
			newnode.next = p; //??????????
			p = newnode; //???p??????
		}
		head = p; //??head
		return head;
	}

	public static void Main()
	{
		int i;
		seqs p;
		p = build();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.addr);
			p = p.next;
		}
	}
}

