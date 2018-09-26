package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String name = new String(new char[20]);
		String name1 = new String(new char[20]);
		char gb;
		char xb;
		int n;
		int aver;
		int py;
		int lw;
		int max = 0;
		int i;
		int j;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				aver = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				py = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lw = Integer.parseInt(tempVar7);
			}
			if (aver > 80 && lw >= 1)
			{
				sum += 8000;
			}
			if (aver > 85 && py > 80)
			{
				sum += 4000;
			}
			if (aver > 90)
			{
				sum += 2000;
			}
			if (aver > 85 && xb == 'Y')
			{
				sum += 1000;
			}
			if (py > 80 && gb == 'Y')
			{
				sum += 850;
			}
			total += sum;
			if (sum > max)
			{
				max = sum;
				for (j = 0;j < 20;j++)
				{
					name1 = tangible.StringFunctions.changeCharacter(name1, j, name.charAt(j));
				}
			}

		}
		System.out.printf("%s\n%d\n%d\n",name1,max,total);
		return 0;
	}


}

