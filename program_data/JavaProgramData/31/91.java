package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct h
	//   {
	//	   char mun[10];
	//	char name[20];
	//	char sex;
	//	int age;
	//	float score;
	//	char add[20];
	//	struct h *p;
	//   };

	   h a;
	   h b;
	   a = len;
	   a.p = null;
	   int i;
	   for (i = 0;i < 1000;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a.mun = tempVar;
		   }
		if (!strcmp(a.mun,"end"))
		{
			break;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a.name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			a.sex = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a.age = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			a.score = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			a.add = tempVar6;
		}
	   b = len;
	   b.p = a;
	   a = b;
	   }
	   a = a.p;
	   while (a != null)
	   {
		 System.out.printf("%s %s %c %d %g %s\n",a.mun,a.name,a.sex,a.age,a.score,a.add);
		 a = a.p;
	   }

	}
}

