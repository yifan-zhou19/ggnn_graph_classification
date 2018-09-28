package <missing>;

public class GlobalMembers
{
	public static int yuan(int p,int q)
	{
		int z = 0;
		if (p > 80 && q >= 1)
		{
			z = 1;
		}
		return z;
	}
	public static int wusi(int p,int q)
	{
	int z = 0;
		if (p > 85 && q > 80)
		{
			z = 1;
		}
		return z;
	}
	public static int youxiu(int p)
	{
	int z = 0;
		if (p > 90)
		{
			z = 1;
		}
		return z;
	}
	public static int xibu(int p,char ip)
	{
	int z = 0;
		if (p > 85 && ip == 'Y')
		{
			z = 1;
		}
		return z;
	}
	public static int banji(int p,char ip)
	{
		int z = 0;

		if (p > 80 && ip == 'Y')
		{
			z = 1;
		}
		return z;
	}

	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int gpa;
	//		int arg;
	//		char leader;
	//		char xibu;
	//		int paper;
	//		int sum;
	//	}
	//	*s;
		int i;
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s = (student)malloc(n * sizeof(student));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(*(s + i)).gpa = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(*(s + i)).arg = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(*(s + i)).leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(*(s + i)).xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(*(s + i)).paper = tempVar7;
			}
			(*(s + i)).sum = 0;
			a = yuan((*(s + i)).gpa, (*(s + i)).paper);
			b = wusi((*(s + i)).gpa, (*(s + i)).arg);
			c = youxiu((*(s + i)).gpa);
			d = xibu((*(s + i)).gpa, (*(s + i)).xibu);
			e = banji((*(s + i)).arg, (*(s + i)).leader);
			(*(s + i)).sum = 8000 * a + 4000 * b + 2000 * c + 1000 * d + 850 * e;
			sum = sum + (*(s + i)).sum;
		}
		for (i = 1;i < n;i++)
		{
			if ((*(s + 0)).sum < (*(s + i)).sum)
			{
			(*(s + 0)) = (*(s + i));
			}
		}
			System.out.printf("%s\n%d\n%d",s[0].name,(*(s + 0)).sum,sum);


	}







}

