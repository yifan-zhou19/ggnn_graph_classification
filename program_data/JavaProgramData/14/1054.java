package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int an;
		int bn;
		int cn;
		int n;
		int i;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num,ch,math;
	//	}
	//	students[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				students[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				students[i].ch = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				students[i].math = tempVar4;
			}
			sum = students[i].ch + students[i].math;
			if (sum > c)
			{
				c = sum;
				cn = i;
			}
			if (sum > b)
			{
				c = b;
				cn = bn;
				b = sum;
				bn = i;

			}
			if (sum > a)
			{
				b = a;
				bn = an;
				a = sum;
				an = i;
			}
		}
		System.out.printf("%d %d\n",students[an].num,a);
		System.out.printf("%d %d\n",students[bn].num,b);
		System.out.printf("%d %d\n",students[cn].num,c);







	}

}

