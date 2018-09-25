package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int n;
		int i;
		int[] zu = new int[100];
		int[][] su = new int[2][100];
		int[] tu = new int[100];
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
		su[0][i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		su[1][i] = Integer.parseInt(tempVar3);
	}
	if (su[0][i] <= 140 && su[0][i] >= 90 && su[1][i] >= 60 && su[1][i] <= 90)
	{
	zu[i] = 1;
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = i;j < n;j++)
	{
	if (zu[j] == 1)
	{
	tu[i]++;
	}
	else
	{
	break;
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (tu[i] > tu[0])
	{
	tu[0] = tu[i];
	}
	}
	System.out.printf("%d",tu[0]);
	return 0;
	}
}

