package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[50];
	//		char name[100];
	//		char sex;
	//		int age;
	//		char score[20];
	//		char add[100];
	//		struct student *before;
	//	}
	//	*thisNode,*newNode;
		for (n = 1;;n++)
		{
			newNode = new student();
			if (newNode == null)
			{
				System.out.print("error!");
				System.exit(-1);
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newNode.num = tempVar;
			}
			if (n == 1)
			{
				newNode.before = null;
			}
			else
			{
				newNode.before = thisNode;
			}
			if (newNode.num[0] == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				newNode.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				newNode.sex = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				newNode.age = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				newNode.score = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				newNode.add = tempVar6;
			}
			thisNode = newNode;
		}
		for (;;)
		{
			System.out.printf("%s %s %c %d %s %s\n",thisNode.num,thisNode.name,thisNode.sex, thisNode.age,thisNode.score,thisNode.add);
			if (thisNode.before == null)
			{
				break;
			}
			thisNode = thisNode.before;
		}
	}
}

