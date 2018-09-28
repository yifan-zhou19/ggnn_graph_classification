package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int i;
		int j = 0;
		int z;
		int[] jin = new int[100];
		int max = 0;
		char[][] s = new char[100][50];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				e[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
		jin[i] = 0;
			if (c[i] > 80 && e[i] >= 1)
			{
				jin[i] = jin[i] + 8000;
			}
			if (c[i] > 85 && d[i] > 80)
			{
				jin[i] = jin[i] + 4000;
			}
			if (c[i] > 90)
			{
				jin[i] = jin[i] + 2000;
			}
			if (c[i] > 85 && b.charAt(i) == 'Y')
			{
				jin[i] = jin[i] + 1000;
			}
			if (d[i] > 80 && a.charAt(i) == 'Y')
			{
				jin[i] = jin[i] + 850;
			}

		}
		j = 0;
		for (i = 0;i < n;i++)
		{
				j = j + jin[i];
		}

		for (i = 0;i < n;i++)
		{
			if (jin[i] > max)
			{
				max = jin[i];
				z = i;
			}
		}


		System.out.printf("%s\n%d\n%d\n",s[z],max,j);
	}

}

