public class student
{
	public student last;
	public String num = new String(new char[50]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public String grade = new String(new char[50]);
	public String address = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static final String a = "end";

	public static student Appendnewnode()
	{
		student head = null;
		student newnode;
		student thisnode;
		student end;
		int i = 0;
		do
		{
			newnode = new student();
			if (newnode == null)
			{
				System.out.print("Memory request failed!");
				System.exit(-1);
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = tempVar.charAt(0);
			}
			if (strcmp(newnode.num,a) != 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
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
					newnode.grade = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					newnode.address = tempVar6.charAt(0);
				}
			}
			if (i == 0)
			{
				head = newnode;
				thisnode = head;
				newnode.last = null;
				if (strcmp(newnode.num,a) != 0)
				{
					newnode.next = null;
				}
				i++;
			}
			else
			{
				thisnode.next = newnode;
				newnode.last = thisnode;
				if (strcmp(newnode.num,a) != 0)
				{
					thisnode = newnode;
				}
			}
		}while (strcmp(newnode.num,a) != 0);
		end = thisnode;
		thisnode.next = null;
		return (end);
	}

	public static void Main()
	{
		student end;
		student p;
		end = Appendnewnode();
		for (p = end;p.last != null;p = p.last)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.grade,p.address);
		}
		System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.grade,p.address);
	}








}

