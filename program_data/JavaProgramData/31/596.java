public class student
{
	public String num = new String(new char[9]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float grade;
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 1;
		int i;
		student thisnode;
		student newnode;
		student p;
		for (i = 1;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			newnode = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newnode.num = tempVar.charAt(0);
			}
			if (newnode.num.charAt(0) == 'e')
			{
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
				newnode.grade = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				newnode.address = tempVar6.charAt(0);
			}
			if (n == 1)
			{
				newnode.next = null;
				thisnode = newnode;
			}
			else
			{
				newnode.next = thisnode;
				thisnode = newnode;
			}
			n++;

		}

		p = thisnode;
		while (p != null)
		{

			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.grade,p.address);
			p = p.next;
		}

	}


}

