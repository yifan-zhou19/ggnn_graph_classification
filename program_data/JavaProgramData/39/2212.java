package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		int[] e = new int[100];
		int[] s = new int[100];
		int[] all = new int[100];
		int sum = 0;
		  char[][] name = new char[100][30];
		  String g = new String(new char[100]);
		  String w = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] R = new int[5];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s2[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				g = tangible.StringFunctions.changeCharacter(g, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				w = tangible.StringFunctions.changeCharacter(w, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				e[i] = Integer.parseInt(tempVar7);
			}
	if ((s1[i] > 80) && (e[i] >= 1))
	{
	R[0] = 8000;
	}
	if ((s1[i] > 85) && (s2[i] > 80))
	{
	R[1] = 4000;
	}
		if (s1[i] > 90)
		{
	R[2] = 2000;
		}

	if ((s1[i] > 85) && (w.charAt(i) == 'Y'))
	{
	R[3] = 1000;
	}

	if ((s2[i] > 80) && (g.charAt(i) == 'Y'))
	{
	R[4] = 850;
	}

			all[i] = R[0] + R[1] + R[2] + R[3] + R[4];
		}
		int r = 0;
		int max = all[0];
		for (i = 0;i < n;i++)
		{
			sum += all[i];
			if (all[i] > max)
			{
				max = all[i];
				r = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",name[r],all[r],sum);
	}

}

