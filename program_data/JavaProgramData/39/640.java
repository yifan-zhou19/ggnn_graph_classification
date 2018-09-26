package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int i;
		int[] x = new int[100];
		int j;
		int sum = 0;
		int[] t = new int[100];
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int y;
		final String name = "";
		String f = new String(new char[100]);
		String e = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tangible.StringFunctions.changeCharacter(name, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				f = tangible.StringFunctions.changeCharacter(f, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] > 80 && c[i] >= 1)
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
			if (a[i] > 85 && e.charAt(i) == 'Y')
			{
				t[i] = t[i] + 1000;
			}
			if (b[i] > 80 && f.charAt(i) == 'Y')
			{
				t[i] = t[i] + 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			sum = sum + t[i];
			x[i] = t[i];
		}
		for (i = 0;i < N - 1;i++)
		{
			for (j = 0;j < N - 1 - i;j++)
			{
				if (t[j] < t[j + 1])
				{
					y = t[j + 1];
					t[j + 1] = t[j];
					t[j] = y;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			if (x[i] == t[0])
			{
				System.out.printf("%s\n%d\n%d\n",name.charAt(i),t[0],sum);
				break;
			}
		}



	}







}

