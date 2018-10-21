public class st //????????????
{
	public String id = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int age;
	public String sco = new String(new char[20]);
	public String ad = new String(new char[20]);
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		st head;
		st p1;
		st p2;
		st p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (st)malloc(len); //???p1,p2?????????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.sco = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.ad = tempVar6.charAt(0);
		}
		p2.next = null_Renamed; //????????????????????
		do //??????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (st)malloc(len); //???????
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.id = tempVar7.charAt(0);
			}
			if (strcmp(p1.id,"end") == 0) //???�end'???????
			{
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.sco = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.ad = tempVar12.charAt(0);
			}
			p1.next = p2; //????????????
			p2 = p1; //?p2?????
		} while (1 != 0);
		head = p2; //?????????????????????
		p = head;
		do //???????????????????
		{
			System.out.printf("%s %s %s %d %s %s\n",p.id,p.name,p.sex,p.age,p.sco,p.ad);
			p = p.next; //???????????
		} while (p != null_Renamed);
		return 0;
	}

}

