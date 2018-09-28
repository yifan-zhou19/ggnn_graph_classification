public class student //?????
{
	public String id = new String(new char[10]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public student next; //next?????????,up???????????????????
	public student up;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			student head;
			student tail;
			student p;
			student r;
			student q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = r = head = (student)malloc(len); //head???????
		p.up = null; //??????up????null??????????up??????????????
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.id = tempVar.charAt(0);
			}
			if (strcmp(p.id,"end") != 0) //???????end??????????
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p.name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					p.gender = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p.age = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					p.score = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					p.address = tempVar6.charAt(0);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p.next = r = (student)malloc(len); //??????next???????up???????
				r.up = p;
				p = r;
			}
			else
			{
				p.next = null; //??????
				tail = p.up; //?tail????????????????up???????????
				break;
			}
		}while (1 != 0);
		q = tail;
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",q.id,q.name,q.gender,q.age,q.score,q.address); //?up?????
			q = q.up;
		}while (q != null);
			return 0;
	}
}

