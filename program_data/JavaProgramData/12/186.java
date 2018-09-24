package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int t;
		int m;
		int[] count = new int[50];
		int[] lie = new int[20];
		char p;
		for (i = 0;i < 50;i++)
		{
	for (j = 0;j < 20;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		lie[j] = Integer.parseInt(tempVar);
	}
	if (lie[0] == -1)
	{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto lalala;
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		p = tempVar2.charAt(0);
	}
	if (p == '\n')
	{
		break;
	}
	}
	count[i] = 0;
	for (l = 0;l < j;l++)
	{
	for (t = 0;t < j;t++)
	{
	if ((lie[l] - 2 * lie[t]) == 0)
	{
	count[i] = count[i] + 1;
	}
	}
	}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lalala:
	for (m = 0;m < i;m++)
	{
	System.out.printf("%d",count[m]);
	if (m != i - 1)
	{
	System.out.print("\n");
	}
	}
	}
}

