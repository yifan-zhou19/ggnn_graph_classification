package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		char[][] name = new char[100][20];
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		int[] a = new int[100];
		int[] b = new int[100];
		int[] e = new int[100];
		int[] t = new int[100];
		int p = 0;
		int tot = 0;
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
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				e[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			t[i] = 0;
			if (a[i] > 80 && e[i] > 0)
			{
				t[i] = t[i] + 8000;
			}
			if (a[i] > 85 && b[i] > 80)
			{
				t[i] = t[i] + 4000;
			}
			if (a[i] > 90)
			{
				t[i] = t[i] + 2000;
			}
			if (a[i] > 85 && d.charAt(i) == 89)
			{
				t[i] = t[i] + 1000;
			}
			if (b[i] > 80 && c.charAt(i) == 89)
			{
				t[i] = t[i] + 850;
			}
			if (t[i] > p)
			{
				p = t[i];
			}
			  tot = tot + t[i];
		}
	j = 0;
	while (t[j] < p)
	{
	 j++;
	}
	System.out.printf("%s\n",name[j]);
	System.out.printf("%d\n",p);
	System.out.printf("%d\n",tot);
	}






}

