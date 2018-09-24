package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[1000];
	//		int s1,s2,gb,west,paper,sum;
	//		struct student *next;
	//	}
	//	*p,*head;
		int n;
		int i;
		int k;
		int l;
		int max = 0;
		int ssum = 0;
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		l = sizeof(student);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(l);
		p = head;
		p.next = null;
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
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.s1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.s2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = tempVar7;
			}
			p.west -= 'N';
			p.gb -= 'N';
			if (n - i - 1 != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p.next = malloc(l);
				p = p.next;
				p.next = null;
			}
		}
		p = head;
		do
		{
			p.sum = 0;
			if (p.s1 > 80 && p.paper)
			{
				p.sum += 8000;
			}
			if (p.s1 > 85 && p.s2 > 80)
			{
				p.sum += 4000;
			}
			if (p.s1 > 90)
			{
				p.sum += 2000;
			}
			if (p.s1 > 85 && p.west)
			{
				p.sum += 1000;
			}
			if (p.s2 > 80 && p.gb)
			{
				p.sum += 850;
			}
			if (p.sum > max)
			{
				max = p.sum;
			}
			p = p.next;
		} while (p);
		p = head;
		k = 1;
		do
		{
			if (p.sum == max && k != 0)
			{
				System.out.printf("%s\n%d\n",p.name,p.sum);
				k = 0;
			}
			ssum += p.sum;
			p = p.next;
		} while (p);
		System.out.printf("%ld",ssum);
	}
}

