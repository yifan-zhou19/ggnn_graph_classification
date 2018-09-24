package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jiangxuejin
	//	{
	//		char name[20],s1,s2;
	//		int qimo,banji,lunwen;
	//	}
	//	s[100];
		int n;
		int i;
		int b;
		int[] jiangjin = new int[100];
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
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].s1 = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].s2 = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].lunwen = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			b = 0;
			if (s[i].qimo > 80 && s[i].lunwen >= 1)
			{
				b += 8000;
			}
			if (s[i].qimo > 85 && s[i].banji > 80)
			{
				b += 4000;
			}
			if (s[i].qimo > 90)
			{
				b += 2000;
			}
			if (s[i].qimo > 85 && s[i].s2 == 'Y')
			{
				b += 1000;
			}
			if (s[i].banji > 80 && s[i].s1 == 'Y')
			{
				b += 850;
			}
			jiangjin[i] = b;
		}
		int largest = 0;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			if (jiangjin[i] >= largest)
			{
				largest = jiangjin[i];
			}
			sum += jiangjin[i];
		}
		for (i = 0;i < n;i++)

		{
			if (jiangjin[i] == largest)
			{
				System.out.printf("%s\n",s[i].name);
				System.out.printf("%d\n",largest);
				System.out.printf("%d",sum);
				break;
			}
		}
		return 0;
	}
}

