public class student
{
	   public String num = new String(new char[20]);
	   public String name = new String(new char[30]);
	   public char sex;
	   public int age;
	   public float score;
	   public String adress = new String(new char[30]);
	   public student next;
	   public student last;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;

	public static student ANewNode()
	{
		student head = null;
		student newnode;
		student thisnode;

		do
		{
			newnode = new student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = tempVar.charAt(0);
			}
			if (strcmp(newnode.num,"end") == 0)
			{
				thisnode.next = null;
				head = thisnode;
				break;
			}
			else
			{
				;
			}
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
				newnode.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				newnode.adress = tempVar6.charAt(0);
			}
			if (n == 1)
			{
				head = newnode;
				thisnode = head;
				thisnode.last = null;
			}
			else
			{
				thisnode.next = newnode;
				newnode.last = thisnode;
			}
				thisnode = newnode;
				n = n + 1;

		}while (strcmp(newnode.num,"enff") != 0);
		return (head);
	}

	public static int Main()
	{
		student head;
		student p;

		head = ANewNode();

		p = head;
		do
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.adress);
			p = p.last;
		}while (p != null);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 return 0;
	}


}

