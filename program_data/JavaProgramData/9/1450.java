package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		int sgh;
		int sgh60;
		sgh = 0;
		sgh60 = 0;
		String d = new String(new char[10]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct guahao
	//	{
	//		char ID[10];
	//		int age;
	//	}
	//	gh[100],gh60[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a >= 60)
			{
				gh60[sgh60].ID = d;
				gh60[sgh60].age = a;
				sgh60 = sgh60 + 1;
			}
			else
			{
				gh[sgh].ID = d;
				gh[sgh].age = a;
				sgh = sgh + 1;
			}
		}
		for (i = 1;i <= sgh60;i++)
		{
			for (j = sgh60 - 1;j > 0;j--)
			{
				if (gh60[j].age > gh60[j - 1].age)
				{
					a = gh60[j].age;
					gh60[j].age = gh60[j - 1].age;
					gh60[j - 1].age = a;
					d = gh60[j].ID;
					gh60[j].ID = gh60[j - 1].ID;
					gh60[j - 1].ID = d;
				}
			}
		}
		for (i = 0;i < sgh60;i++)
		{
			System.out.printf("%s\n",gh60[i].ID);
		}
		for (i = 0;i < sgh;i++)
		{
			System.out.printf("%s\n",gh[i].ID);
		}
		return 0;
	}
}

