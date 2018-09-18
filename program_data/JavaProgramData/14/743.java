package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct
	// {
	//	 int id;
	//	 int yuwen;
	//	 int shuxue;
	// }
	// stu[1000001];
	 int[] grade = new int[100000];
	 int i;
	 int a;
	 int b;
	 int m1 = 0;
	 int m2 = 0;
	 int m3 = 0;
	 int m1id;
	 int m2id;
	 int m3id;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].id = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 stu[i].yuwen = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].shuxue = tempVar4;
		 }
		 grade[i] = stu[i].yuwen + stu[i].shuxue;
	 }
	 for (i = 0;i < n;i++)
	 {
		 if (grade[i] > m1)
		 {
		 m1 = grade[i];
		a = i;
		m1id = stu[i].id;
		 }
	 }
	 System.out.printf("%d ",m1id);
	 System.out.printf("%d\n",m1);

	 for (i = 0;i < n;i++)
	 {
		 if ((grade[i] > m2) && (i != a))
		 {
		 m2 = grade[i];
		b = i;
		m2id = stu[i].id;
		 }
	 }
	 System.out.printf("%d ",m2id);
	 System.out.printf("%d\n",m2);
	 for (i = 0;i < n;i++)
	 {
		 if ((grade[i] > m3) && (i != a) && (i != b))
		 {
		 m3 = grade[i];
	   m3id = stu[i].id;
		 }
	 }
	 System.out.printf("%d ",m3id);
	 System.out.printf("%d\n",m3);
	}

}

