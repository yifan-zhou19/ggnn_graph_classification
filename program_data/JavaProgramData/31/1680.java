public class node
{
 public String no = new String(new char[20]);
 public String name = new String(new char[20]);
 public char sex;
 public String ad = new String(new char[20]);
 public String score = new String(new char[20]);
 public int age;
 public node next;
}

package <missing>;

public class GlobalMembers
{
	public static node start = null;
	public static node p;
	public static int Main()
	{

		node temp;

		while (1 == 1)
		{
			temp = new node();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				temp.no = tempVar.charAt(0);
			}
			if (strcmp(temp.no,"end") == 0)
			{
				break;
			}

			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				temp.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				temp.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				temp.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				temp.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				temp.ad = tempVar6.charAt(0);
			}
			temp.next = start;
			start = temp;

		}
		p = start;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.no,p.name,p.sex,p.age,p.score,p.ad);
			p = p.next;
		}
	System.out.print("\n");
	return 0;

	}
}

