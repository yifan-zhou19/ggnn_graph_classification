package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String danchi = new String(new char[1000]);
		char[][] e = new char[50][1000];
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		danchi = new Scanner(System.in).nextLine();
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = tempVar.charAt(0);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(" ");
			 if (tempVar2 != null)
			 {
				 b = tempVar2.charAt(0);
			 }
		int i;
		int j;
		int g = 0;
		int l = 0;
		int v = 0;
		int m = 0;
		int max = 0;
		int min = 100;
		int max1;
		int min1;

			 int c = danchi.length();
		for (j = 0;j < 50;j++)
		{
					  l = 0;
			for (i = g;i < 1000;i++)
			{
					if (danchi.charAt(i) == ' ')
					{
						m++;
						break;
					}
					e[j][l] = danchi.charAt(i);
					g++;
					l++;
					v++;

			}
				g++;
				v++;

					if (v > c)
					{
						break;
					}
		}

	for (i = 0;i < m;i++)
	{
		if (strcmp(e[i],a) == 0)
		{
			System.out.printf("%s ",b);
		}
		else
		{
			System.out.printf("%s ",e[i]);
		}
	}
	if (strcmp(e[m],a) == 0)
	{
		System.out.printf("%s",b);
	}
	else
	{
		System.out.printf("%s",e[m]);
	}

		return 0;
	}

}

