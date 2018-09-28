package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String name = new String(new char[20]);
		char g;
		char x;
		String highestname = new String(new char[20]);
		int[] q = new int[100];
		int[] b = new int[100];
		int[] l = new int[100];
		int n;
		int i;
		int j;
		int[] sum = new int[100];
		int max = 0;
		int t;
		int total = 0;
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
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				l[i] = Integer.parseInt(tempVar7);
			}
			if ((q[i] > 80) && l[i] >= 1)
			{
				sum[i] += 8000;
			}
			if (q[i] > 85 && b[i] > 80)
			{
				sum[i] += 4000;
			}
			if (q[i] > 90)
			{
				sum[i] += 2000;
			}
			if (q[i] > 85 && x == 'Y')
			{
				sum[i] += 1000;
			}
			if (b[i] > 80 && g == 'Y')
			{
				sum[i] += 850;
			}

			total += sum[i];
			if (sum[i] > max)
			{
				max = sum[i];
				t = i;
				for (j = 0;name.charAt(j) != '\0';j++)
				{

					highestname = tangible.StringFunctions.changeCharacter(highestname, j, name.charAt(j));
				}
				highestname = tangible.StringFunctions.changeCharacter(highestname, j, '\0');
			}
		}

		System.out.printf("%s\n%d\n%d\n",highestname,sum[t],total);
		return 0;
	}
}

