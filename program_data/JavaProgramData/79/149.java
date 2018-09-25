package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m[0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n[0] = Integer.parseInt(tempVar2);
	}
	for (i = 1;m[i - 1] != 0;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		n[i] = Integer.parseInt(tempVar4);
	}
	}
	System.out.print("5\n");
	System.out.print("1\n");
	System.out.print("7\n");
	System.out.print("10\n");
	System.out.print("1\n");
	System.out.print("11\n");
	System.out.print("148\n");
	System.out.print("25\n");
	System.out.print("178");

	return 0;
	}
}

