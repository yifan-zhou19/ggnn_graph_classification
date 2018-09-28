public class student
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public char sex;
	public int age;
	public float score;
	public String ad = new String(new char[100]);
	public student next;
	public student former;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;
	public static student creat()
	{
		student thisnode;
		student newnode;
		student head;
		do
		{
		newnode = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			newnode.num = tempVar.charAt(0);
		}
		if (newnode.num.charAt(0) != 'e')
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				newnode.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				newnode.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				newnode.ad = tempVar6.charAt(0);
			}
		   head = newnode;
		   if (n == 1)
		   {
			   newnode.former = null;
		   }
		   else
		   {
			thisnode.next = newnode;
			newnode.former = thisnode;
		   }
		   thisnode = newnode;
		   n = n + 1;
		}
		else
		{
			thisnode.next = null;
		}
		}while (newnode.num.charAt(0) != 'e');
		return (head);
	}
	public static void Main()
	{
		student p;
		p = creat();
		do
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.ad);
			p = p.former;
		}while (p != null);
	}





}

