package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int id;
	//	int x;
	//	int y;
	//	int z;
	//	}
	//	student1,student2,student3,studenta;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student1.z = student2.z = student3.z = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				studenta.id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				studenta.x = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				studenta.y = tempVar4;
			}
			studenta.z = studenta.x + studenta.y;
			if (studenta.z > student1.z)
			{
				student3.z = student2.z;
				student3.id = student2.id;
				student2.z = student1.z;
				student2.id = student1.id;
				student1.z = studenta.z;
				student1.id = studenta.id;
			}
			else if (studenta.z > student2.z)
			{
				student3.z = student2.z;
				student3.id = student2.id;
				student2.z = studenta.z;
				student2.id = studenta.id;
			}
			else if (studenta.z > student3.z)
			{
				student3.z = studenta.z;
				student3.id = studenta.id;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",student1.id,student1.z,student2.id,student2.z,student3.id,student3.z);
	}
}

