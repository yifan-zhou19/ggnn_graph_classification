public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[30]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[30]);
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		student tail;
		student p;
		int i = 0;
		int j;


		while (scanf("%s %s %c %d %s %s", stu[i].num, stu[i].name, stu[i].gender, stu[i].age, stu[i].score, stu[i].address) != EOF)
		{
				i++;
		}
	//	for (i=0;stu[i].num[0]!='e';i++)
	//	{
	//		scanf ("%s %s %c %d %d %s",stu[i].num, stu[i].name, 
	//			&stu[i].gender, &stu[i].age, &stu[i].score, stu[i].address);
	//	}
		tail = stu[i - 1];
		for (j = i - 1;j >= 0;j--)
		{
			stu[j].before = stu[j - 1];
		}
		stu[0].before = null;
		p = tail.before;
		do
		{

				System.out.printf("%s %s %c %d %s %s\n",p.num, p.name, p.gender, p.age, p.score, p.address);


		p = p.before;
		} while (p != 0);
	}

}

