package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] name = new char[100][21];
		String gan = new String(new char[100]);
		String west = new String(new char[100]);
		String temp1 = new String(new char[21]);
		int[] end = new int[100];
		int[] cls = new int[100];
		int[] esy = new int[100];
		int[] rmb = new int[100];
		int n;
		int i;
		int j;
		int sum;
		int temp2;
		char a = 'Y';
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
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				cls[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gan = tangible.StringFunctions.changeCharacter(gan, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				west = tangible.StringFunctions.changeCharacter(west, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				esy[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			rmb[i] = 0;
			if (end[i] > 80 && esy[i] > 0)
			{
				rmb[i] += 8000;
			}
			if (end[i] > 85 && cls[i] > 80)
			{
				rmb[i] += 4000;
			}
			if (end[i] > 90)
			{
				rmb[i] += 2000;
			}
			if (end[i] > 85 && west.charAt(i) == a)
			{
				rmb[i] += 1000;
			}
			if (cls[i] > 80 && gan.charAt(i) == a)
			{
				rmb[i] += 850;
			}
		}
		for (i = 0,sum = 0;i < n;i++)
		{
			sum += rmb[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (rmb[j] >= rmb[j + 1])
				{
					temp2 = rmb[j];
					rmb[j] = rmb[j + 1];
					rmb[j + 1] = temp2;
					temp1 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp1;
				}
			}
		}
		System.out.printf("%s\n",name[n - 1]);
		System.out.printf("%d\n",rmb[n - 1]);
		System.out.printf("%d\n",sum);
	}


}

