public class student
{
	public int a;
	public int b;
	public int c; //?????????????
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int temp;
		int temp2;
		int sum = 0;
		int max1;
		int max2;
		int max3;
		int id1;
		int id2;
		int id3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int[] end = new int[n]; //??????????????????????
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].c = Integer.parseInt(tempVar4);
			}
			end[i] = s[i].b + s[i].c;
		}
		max1 = -100;
		max2 = -100;
		max3 = -100;
		id1 = s[0].a;
		id2 = s[0].a;
		id3 = s[0].a;
		for (i = 0;i < n;i++)
		{
			if (end[i] > max1)
			{
			max1 = end[i];
			id1 = s[i].a;
			} //?????
		}
		for (i = 0;i < n;i++)
		{
			if (end[i] != max1 && end[i] > max2)
			{
				max2 = end[i];
				id2 = s[i].a;
			} //?????
		}
		for (i = 0;i < n;i++)
		{
			if (end[i] != max1 && end[i] != max2 && end[i] > max3)
			{
				max3 = end[i];
				id3 = s[i].a;
			} //???????(????????????????????????????????)
		}

		for (i = 0;i < n;i++)
		{
			if (end[i] == max1)
			{
				System.out.printf("%d %d\n",s[i].a,max1);
				sum++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sum <= 2 && end[i] == max2)
			{
				System.out.printf("%d %d\n",s[i].a,max2);
				sum++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sum <= 2 && end[i] == max3)
			{
				System.out.printf("%d %d\n",s[i].a,max3);
			}
		} //???????????????????????

		s = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(end);

	}


}

