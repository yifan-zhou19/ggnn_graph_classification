package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	br [100],*p,old[100],*q;
		for (p = br;p < br + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.id) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p.age) = tempVar3;
			}
		}
		q = old;
		int js = 0;
		for (p = br;p < br + n;p++)
		{
			if (p.age >= 60)
			{
				q.age = p.age;
				q.id = p.id;
				q++;
				js++;
				p.age = 0;
			}
		}
		int max = 0;
		for (i = 0;i < js;i++)
		{
			for (q = old;q < old + js;q++)
			{
				if (q.age > (old + max).age)
				{
					max = q - old;
				}
			}
			System.out.printf("%s\n",(old + max).id);
			(old + max).age = 0;
		}
		for (p = br;p < br + n;p++)
		{
			if (p.age != 0)
			{
				System.out.printf("%s\n",p.id);
			}
		}
		return 0;
	}

}

