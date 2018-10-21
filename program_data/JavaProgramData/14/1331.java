package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID,Ch,Ma;
	//	}
	//	temp;
		int fID = 0;
		int fG = 0;
		int sID = 0;
		int sG = 0;
		int tID = 0;
		int tG = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp.ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				temp.Ch = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				temp.Ma = tempVar4;
			}
			sum = temp.Ch + temp.Ma;
			if (sum == fG)
			{
				tG = sG;
				tID = sID;
				sG = sum;
				sID = temp.ID;
			}
			if (sum > fG)
			{
				tG = sG;
				tID = sID;
				sG = fG;
				sID = fID;
				fG = sum;
				fID = temp.ID;
			}
			if (sum < fG && sum> sG)
			{
				tG = sG;
				tID = sID;
				sG = sum;
				sID = temp.ID;
			}
			if (sum < sG && sum> tG)
			{
				tG = sum;
				tID = temp.ID;
			}
		}
		System.out.printf("%d %d\n",fID,fG);
		System.out.printf("%d %d\n",sID,sG);
		System.out.printf("%d %d\n",tID,tG);

	}
}

