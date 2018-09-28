package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a1 = 8000;
		int a2 = 4000;
		int a3 = 2000;
		int a4 = 1000;
		int a5 = 850;
		int max = 0;
		int top = 0;
		int sum = 0;
		int[] grade = new int[100];
		int[] assess = new int[100];
		int[] article = new int[100];
		int[] award = new int[100];
		String west = new String(new char[100]);
		String official = new String(new char[100]);
		char[][] name = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			System.in.read();
			for (j = 0;j < 20;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					name[i][j] = tempVar2.charAt(0);
				}
				if (name[i][j] == ' ')
				{
					break;
				}
			}
			award[i] = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grade[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				assess[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				official = tangible.StringFunctions.changeCharacter(official, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				west = tangible.StringFunctions.changeCharacter(west, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				article[i] = Integer.parseInt(tempVar7);
			}
			if (grade[i] > 80 && article[i] > 0)
			{
				award[i] += a1;
			}
			if (grade[i] > 85 && assess[i] > 80)
			{
				award[i] += a2;
			}
			if (grade[i] > 90)
			{
				award[i] += a3;
			}
			if (grade[i] > 85 && west.charAt(i) == 'Y')
			{
				award[i] += a4;
			}
			if (assess[i] > 80 && official.charAt(i) == 'Y')
			{
				award[i] += a5;
			}
			sum += award[i];
			if (award[i] > max)
			{
				max = award[i];
				top = i;
			}
		}
		for (i = 0;i < 20;i++)
		{
			if (name[top][i] != ' ')
			{
				System.out.printf("%c",name[top][i]);
			}
			else
			{
				break;
			}
		}
		System.out.printf("\n%d\n%d\n",max,sum);
		return 0;
	}

}

