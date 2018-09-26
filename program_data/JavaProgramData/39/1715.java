public class stu
{
	public String nam = new String(new char[21]);
/*	int sc1;
	int sc2;
	char mon;
	char wes;
	int pap;*/
	public int sch;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int n;
		int i;
		int sc1;
		int sc2;
		int pap;
		int sum = 0;
		char mon;
		char wes;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		len = sizeof(stu);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu head;
		stu p0;
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p0 = (stu)malloc(len);
			if (i == 1)
			{
				head = p0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p0.nam = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sc1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sc2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				mon = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				wes = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				pap = Integer.parseInt(tempVar7);
			}
			p0.sch = 0;
			if (sc1 > 80 && pap > 0)
			{
				p0.sch = p0.sch + 8000;
			}
			if (sc1 > 85 && sc2 > 80)
			{
				p0.sch = p0.sch + 4000;
			}
			if (sc1 > 90)
			{
				p0.sch = p0.sch + 2000;
			}
			if (sc1 > 85 && wes == 'Y')
			{
				p0.sch = p0.sch + 1000;
			}
			if (sc2 > 80 && mon == 'Y')
			{
				p0.sch = p0.sch + 850;
			}
			sum = sum + p0.sch;
			if (p0.sch > head.sch)
			{
				head = p0;
			}
		}
		System.out.printf("%s\n%d\n%d\n",head.nam,head.sch,sum);

	}

}

