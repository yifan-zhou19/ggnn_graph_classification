package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] grade1 = new int[100];
		int[] grade2 = new int[100];
		int[] lunwen = new int[100];
		int[] money = new int[100];
		int moneyall = 0;
		int max = 0;
		int p;
	char[][] name = new char[100][100];
	String ganbu = new String(new char[100]);
	String xibu = new String(new char[100]);
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		grade1[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		grade2[i] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		lunwen[i] = Integer.parseInt(tempVar7);
	}
	if (grade1[i] > 80 && lunwen[i] >= 1)
	{
	money[i] = money[i] + 8000;
	}
	if (grade1[i] > 85 && grade2[i] > 80)
	{
	money[i] = money[i] + 4000;
	}
	if (grade1[i] > 90)
	{
	money[i] = money[i] + 2000;
	}
	if (grade1[i] > 85 && xibu.charAt(i) == 'Y')
	{
	money[i] = money[i] + 1000;
	}
	if (grade2[i] > 80 && ganbu.charAt(i) == 'Y')
	{
	money[i] = money[i] + 850;
	}
	}

	for (i = 0;i < n;i++)
	{
		if (money[i] > max)
		{
	max = money[i];
	p = i;
		}
	moneyall = moneyall + money[i];
	}
	System.out.printf("%s",name[p]);
	System.out.print("\n");
	System.out.printf("%d",max);
	System.out.print("\n");
	System.out.printf("%d",moneyall);
	return 0;
	}



}

