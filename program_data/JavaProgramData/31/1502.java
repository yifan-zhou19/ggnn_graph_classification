public class student
{
	public String num = new String(new char[30]);
	public String name = new String(new char[30]);
	public char s;
	public float grad1;
	public float grad2;
	public String add = new String(new char[30]);
	public student next;
	public student prev;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student temp;
		student end;
		head = new student();
		temp = head;
		head.prev = null;


		while (true)
		{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		temp.num = tempVar.charAt(0);
	}
	if (strcmp(temp.num,"end") == 0)
	{
	break;
	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		temp.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		temp.s = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		temp.grad1 = Float.parseFloat(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		temp.grad2 = Float.parseFloat(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		temp.add = tempVar6.charAt(0);
	}

	temp.next = new student();
	temp.next.prev = temp;
	temp = temp.next;

		}
	end = temp.prev;
	end.next = null;


	temp = end;
	while (temp != 0)
	{
		System.out.printf("%s %s %c %g %g %s\n",temp.num,temp.name,temp.s,temp.grad1,temp.grad2,temp.add);
		temp = temp.prev;
	}
	}
}

