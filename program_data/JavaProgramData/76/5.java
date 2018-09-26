package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	int[] tag = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct part
	//	{
	//		int start;
	//		int end;
	//	};
		part[] number = tangible.Arrays.initializeWithDefaultpartInstances(50000); //???????
		int i;
		int j;
		int max;
		int min;
		int result;
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
				number[i].start = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				number[i].end = tempVar3;
			}
		} //????
		max = 0;
		min = 10000;
		result = 0;

		for (i = 0;i < 10000;i++)
		{
			tag[i] = 1; //????????1~10000????1????????????????0
		}
		for (i = 0;i < n;i++)
		{
				if (number[i].end > max)
				{
					max = number[i].end;
				}
				if (min > number[i].start)
				{
					min = number[i].start;
				}

		} //?????end????start
		for (i = 0;i < n;i++) //{
		{
			for (j = number[i].start;j < number[i].end;j++) //{
			{
		//		if(number[i].start<j<=number[i].end&&tag[j]==1){
					tag[j] = 0;
			}
		}
			//	}
		//	}
	//	}//?????????tag???0
		for (i = min + 1;i < max;i++)
		{
			if (min < i <= max)
			{
				if (tag[i] == 1)
				{
					System.out.print("no");
					result = 1;
					break;
				}
			}
		}
		if (result == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

