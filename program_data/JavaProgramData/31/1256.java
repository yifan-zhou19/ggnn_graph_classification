public class student
{
	public String xh = new String(new char[20]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public String gra = new String(new char[10]);
	public String adds = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		student pa;
		student pb;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pa = pb = (student)malloc(l);
		for (i = 0; ;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				pa.xh = tempVar.charAt(0);
			}
			if (pa.xh.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pa.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				pa.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pa.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				pa.gra = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				pa.adds = tempVar6.charAt(0);
			}
			if (i == 0)
			{
				pa.next = null;
			}
			else
			{
				pa.next = pb;
			}
			pb = pa;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pa = (student)malloc(l);
		}

		while (pb != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",pb.xh,pb.name,pb.sex,pb.age,pb.gra,pb.adds);
			pb = pb.next;
		}
	}

}

