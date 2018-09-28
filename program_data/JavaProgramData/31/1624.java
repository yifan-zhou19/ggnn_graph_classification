public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] p;
		student head;
		student q;
		p = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		int i;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i].num = tempVar.charAt(0);
			}
			if (p[i].num.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p[i].sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i].age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p[i].score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p[i].address = tempVar6.charAt(0);
			}
		}
		k = i - 1;
		head = p[k];
		for (i = k;i >= 1;i--)
		{
			p[i].next = p[i - 1];
		}
		p[0].next = null;
		q = head;
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",q.num,q.name,q.sex,q.age,q.score,q.address);
			q = q.next;
		} while (q != null);
	}

}

