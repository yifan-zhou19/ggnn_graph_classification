package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int mat;
		int chi;
		int i;
		int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int id;
	//		int to;
	//	}
	//	s[100001],temp1,temp2,max1,max2,max3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				mat = Integer.parseInt(tempVar4);
			}
			s[i].to = chi + mat;
		}
		if (s[0].to > s[1].to && s[1].to > s[2].to)
		{
			max1 = s[0];
			max2 = s[1];
			max3 = s[2];
		}
		else if (s[2].to > s[0].to && s[0].to > s[1].to)
		{
			max1 = s[2];
			max2 = s[0];
			max3 = s[1];
		}
		else if (s[0].to > s[2].to && s[2].to > s[1].to)
		{
			max1 = s[0];
			max2 = s[2];
			max3 = s[1];
		}
		else if (s[2].to > s[1].to && s[1].to > s[0].to)
		{
			max1 = s[2];
			max2 = s[1];
			max3 = s[0];
		}
		else if (s[1].to > s[0].to && s[0].to > s[2].to)
		{
			max1 = s[1];
			max2 = s[0];
			max3 = s[2];
		}
		else
		{
			max1 = s[1];
			max2 = s[2];
			max3 = s[0];
		}
		for (i = 0;i < num - 1;i++)
		{
			if (s[i].to > max1.to)
			{
				temp1 = max1;
				temp2 = max2;
				max1 = s[i];
				max2 = temp1;
				max3 = temp2;
			}
			else if (s[i].to > max2.to && s[i].id != max1.id)
			{
				temp1 = max2;
				max2 = s[i];
				max3 = temp1;
			}
			else if (s[i].to > max3.to && s[i].id != max2.id && s[i].id != max1.id)
			{
				max3 = s[i];
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",max1.id,max1.to,max2.id,max2.to,max3.id,max3.to);
	}

}

