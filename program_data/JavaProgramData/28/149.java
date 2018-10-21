package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] n = new int[301];
	int j;
	int i = 0;
	int f = 0;
	for (j = 0;j < 301;j++)
	{
		n[j] = 0;
	}

	char c;
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		c = tempVar.charAt(0);
	}
	while (c != '\n')
	{
		if (c != ' ')
		{
			n[i]++;
			f = 1;
		}
	else if (c == ' ' && f != 0)
	{
		i++;
		f = 0;
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	}
	System.out.printf("%d",n[0]);
	for (j = 1;j <= i;j++)
	{
		System.out.printf(",%d",n[j]);
	}
	System.out.print("\n");
	}
}

