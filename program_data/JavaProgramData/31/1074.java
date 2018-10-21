public class students
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String addr = new String(new char[100]);
	public students next;
}

package <missing>;

public class GlobalMembers
{
	public static int l;

	public static students ann()
	{
		students head = null;
		students newnode;
		students p;
		int i;
		for (i = 0;;i++)
		{
			newnode = new students();

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = tempVar.charAt(0);
			}
			if (newnode.num.charAt(0) == 'e')
			{
				l = i;
				head = p;
				break;
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
				newnode.addr = tempVar6.charAt(0);
			}
			if (i == 0)
			{
				newnode.next = null;
				p = newnode;
			}
			else
			{
				newnode.next = p;
				p = newnode;
			}
		}
		return (head);
	}


	public static void Main()
	{
		int i;
		students p;
		p = ann();
		for (i = 0;i < l;i++)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.addr);
			p = p.next;
		}

	}

}

