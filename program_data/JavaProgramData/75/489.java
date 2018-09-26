package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] myarray = new int[1000];
		int[][] people = new int[100000][2];
		int size = 0;
		int num = 0;
		char a;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				people[size++][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a != ',')
			{
				break;
			}
		}
		for (int i = 0;i < size;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				people[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				a = tempVar4.charAt(0);
			}
		}
		for (int i = 0;i < size;i++)
		{
			for (int j = people[i][0] + 1;j <= people[i][1];j++)
			{
				myarray[j]++;
			}
		}
		for (int i = 0;i < 1000;i++)
		{
			if (myarray[i] > num)
			{
				num = myarray[i];
			}
		}

		System.out.printf("%d %d\n",size,num);
	}
}

