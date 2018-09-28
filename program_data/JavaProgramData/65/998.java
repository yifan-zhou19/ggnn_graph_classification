package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[][] a = new int[200][2];
	int ascore = 0;
	int bscore = 0;
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
		a[i][0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][1] = Integer.parseInt(tempVar3);
	}
	if (a[i][0] == 0 && a[i][1] == 1)
	{
		ascore++;
	}
	if (a[i][0] == 0 && a[i][1] == 2)
	{
		bscore++;
	}
	if (a[i][0] == 1 && a[i][1] == 0)
	{
		bscore++;
	}
	if (a[i][0] == 1 && a[i][1] == 2)
	{
		ascore++;
	}
	if (a[i][0] == 2 && a[i][1] == 0)
	{
		ascore++;
	}
	if (a[i][0] == 2 && a[i][1] == 1)
	{
		bscore++;
	}
	}
	if (ascore > bscore)
	{
		System.out.print("A");
	}
	if (bscore > ascore)
	{
		System.out.print("B");
	}
	if (ascore == bscore)
	{
		System.out.print("Tie");
	}
	}
}

