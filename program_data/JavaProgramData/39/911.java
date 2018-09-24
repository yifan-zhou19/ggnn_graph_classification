package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//		int fin;
	//		int cls;
	//		char off;
	//		char wst;
	//		int pap;
	//	}
	//	s[100];
		int n;
		int i;
		int[] m = new int[100];
		int sum = 0;
		int max;
		int maxi;

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
				s[i].fin = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].cls = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].off = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].wst = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].pap = tempVar7;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (s[i].fin > 80 && s[i].pap >= 1)
			{
				m[i] += 8000;
			}
			if (s[i].fin > 85 && s[i].cls > 80)
			{
				m[i] += 4000;
			}
			if (s[i].fin > 90)
			{
				m[i] += 2000;
			}
			if (s[i].fin > 85 && s[i].wst == 'Y')
			{
				m[i] += 1000;
			}
			if (s[i].cls > 80 && s[i].off == 'Y')
			{
				m[i] += 850;
			}
			sum += m[i];
			if (i == 0)
			{
				max = m[i];
				maxi = i;
			}
			else if (m[i] > max)
			{
				max = m[i];
				maxi = i;
			}
		}

		System.out.printf("%s\n%d\n%d\n",s[maxi].name,m[maxi],sum);
	}
}

