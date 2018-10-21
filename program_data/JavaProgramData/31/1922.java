public class student
{
	public String num = new String(new char[20]);
public String name = new String(new char[20]);
public char sex;
public int age;
public String score = new String(new char[10]);
public String ad = new String(new char[20]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;
	public static student appendnewnode()
	{
		student newnode;
		student thisnode;
		int x;
		do
		{
			newnode = new student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = tempVar.charAt(0);
			}
			System.in.read();
			x = strcmp(newnode.num,"end");
			if (x != 0)
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
					newnode.score = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					newnode.ad = tempVar6.charAt(0);
				}
			if (n == 1)
			{
				newnode.next = null;
			}
			else
			{
				newnode.next = thisnode;
			}
			thisnode = newnode;
			n++;
			}
		}while (x != 0);
		return (thisnode);
	}
	public static void Main()
	{
		student p;
		student head;
		head = appendnewnode();
		p = head;
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.ad);
			p = p.next;
		}while (p != null);
	}

}

