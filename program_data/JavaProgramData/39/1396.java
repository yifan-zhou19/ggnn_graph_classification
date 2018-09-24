package <missing>;

public class GlobalMembers
{
	/*????????*/

	public static void Main()
	{
		int n;
		int k;
		int[][] x = new int[100][4];
		int y;
		int z;
		char[][] a = new char[100][20];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0,y = 0,z = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[k][0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				x[k][1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				x[k][2] = Integer.parseInt(tempVar7);
			}
			x[k][3] = 0;
			if (x[k][0] > 80 && x[k][2] > 0)
			{
				x[k][3] = x[k][3] + 8000;
			}
			if (x[k][0] > 85 && x[k][1] > 80)
			{
				x[k][3] = x[k][3] + 4000;
			}
			if (x[k][0] > 90)
			{
				x[k][3] = x[k][3] + 2000;
			}
			if (x[k][0] > 85 && c.charAt(k) == 'Y')
			{
				x[k][3] = x[k][3] + 1000;
			}
			if (x[k][1] > 80 && b.charAt(k) == 'Y')
			{
				x[k][3] = x[k][3] + 850;
			}
			z = z + x[k][3];
			if (x[k][3] > x[y][3])
			{
				y = k;
			}
		}
		System.out.printf("%s\n%d\n%d\n",a[y],x[y][3],z);
	}



}

