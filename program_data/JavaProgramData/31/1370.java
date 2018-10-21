public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char s;
	public int age;
	public String point = new String(new char[10]);
	public String adr = new String(new char[50]);
	public stu p;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu stu1 = null;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		int n = sizeof(stu);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		stu1 = (stu) malloc(n);
		stu head = null;
		stu curent = null;
		stu1.p = null;
		while (scanf("%s",stu1.num))
		{
			if ((strcmp(stu1.num,"end")) == 0)
			{
				break;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				stu1.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar2 != null)
			{
				stu1.s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu1.age = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu1.point = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu1.adr = tempVar5.charAt(0);
			}
			stu1.p = curent;
			curent = stu1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			stu1 = (stu) malloc(n);
		}
		while (curent != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",curent.num,curent.name,curent.s,curent.age,curent.point,curent.adr);
			curent = curent.p;
		}
	}
}

