package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int[] a = new int[400];
	int max = 0;
	int min = -1;
	String c = new String(new char[400]);
	for (i = 0;;i++)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			for (j = 0;;j++)
			{
					c = tangible.StringFunctions.changeCharacter(c, j, System.in.read());
				if (c.charAt(j) == ',')
				{
					break;
				}
				if (c.charAt(j) == 10)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto abc;
				}
			}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	abc:
	;
	for (j = 0;j <= i;j++)
	{
		if (a[j] > max)
		{
			max = a[j];
		}
	}
	for (j = 0;j <= i;j++)
	{
	if (a[j] == max)
	{
		a[j] = -2;
	}
	}
	for (j = 0;j <= i;j++)
	{
	if (a[j] > min)
	{
		min = a[j];
	}
	}
	if (min == -1)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",min);
	}

	}
}

