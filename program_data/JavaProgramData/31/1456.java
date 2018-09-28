public class stud
{
	public String no = new String(new char[50]);
	public String name = new String(new char[50]);
	public char sex;
	public int y;
	public String sc = new String(new char[30]);
	public String addr = new String(new char[50]);
	public stud pre;
}

package <missing>;

public class GlobalMembers
{
	public static stud creat()
	{
		stud p1;
		stud p2;
		String g = "end";
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stud) malloc(LEN);
		p1.pre = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.no = tempVar.charAt(0);
		}
		while (strcmp(p1.no,g))
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.y = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.sc = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.addr = tempVar6.charAt(0);
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stud) malloc(LEN);
			if (p1 == null)
			{
				return null;
			}
			p1.pre = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.no = tempVar7.charAt(0);
			}
		}
		return (p1.pre);
	}

	public static void Main()
	{
		stud pt;
		pt = creat();
		while (pt != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",pt.no,pt.name,pt.sex,pt.y,pt.sc,pt.addr);
			pt = pt.pre;
		}
	}


}

