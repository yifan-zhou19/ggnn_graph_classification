public class student
{
		public String num = new String(new char[10]);
		public String name = new String(new char[50]);
		public String addr = new String(new char[50]);
		public String score = new String(new char[10]);
		public char sex;
		public int age;
		public student before;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1 = null;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (student)malloc(len);
		while (scanf("%s %s %c %d %s %s", p2.num, p2.name, (p2.sex), (p2.age), p2.score, p2.addr) != EOF)
		{
			if (p2.num.charAt(0) == 'e')
			{
				break;
			}
			p2.before = p1;
			p1 = p2;
			//printf("%s %s %c %d %d %s\n",p2->num,p2->name,p2->sex,p2->age,p2->score,p2->addr);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(len);
		}
		p2 = p1;
		while (p2 != 0)
		{
			System.out.printf("%s %s %c %d %s %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.addr);
			p2 = p2.before;
		}
		System.in.read();
		System.in.read();
	}
}
