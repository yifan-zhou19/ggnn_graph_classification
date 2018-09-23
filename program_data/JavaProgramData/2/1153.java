package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tushu
	//	{
	//		int num;
	//		char zuozhe[27];
	//	}
	//	ts[999];

		int i;
		int j;
		int n;
		int k;
		int temp;
		int[] count = new int[26];

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
				ts[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ts[i].zuozhe = tempVar3;
			}
			for (j = 0;ts[i].zuozhe[j] != '\0';j++)
			{
				count[ts[i].zuozhe[j] - 65]++;
			}
		}
		temp = count[0];
		k = 0;
		for (i = 0;i < 26;i++)
		{
			if (count[i] > temp)
			{
				k = i;
				temp = count[i];
			}
		}
		System.out.printf("%c\n",k + 65);
		System.out.printf("%d\n",count[k]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;ts[i].zuozhe[j] != '\0';j++)
			{
				if (ts[i].zuozhe[j] == k + 65)
				{
					System.out.printf("%d\n",ts[i].num);
					break;
				}
			}
		}
	}

}

