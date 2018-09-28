package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[300];
	int i = 0;
	int mark = 0;
	int j;
	int k;
	int p;
	int h;
	int q;
	String ch = new String(new char[300]);
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		ch = tangible.StringFunctions.changeCharacter(ch, i, tempVar2);
	}
	if (ch.charAt(i) != ',')
	{
	break;
	}
	i++;
	}
	if (i == 0)
	{
	System.out.print("No");
	}
	else
	{
	for (j = 1;j <= i;j++)
	{
		if (a[0] < a[j])
		{
			p = a[0];
			a[0] = a[j];
			a[j] = p;
		}

	}
	for (h = 1;h <= i;h++)
	{
		if (a[h] == a[0])
		{
		a[h] = 0;
		}
	}

	for (k = 2;k <= i;k++)
	{

			if (a[1] < a[k])
			{
				a[1] = a[k];
			}
	}
	for (q = 2;q <= i;q++)
	{
		if ((a[1] == a[k]) || (a[1] == 0))
		{
			mark = 1;
		}
	}
	if (mark == 0)
	{
	System.out.printf("%d",a[1]);
	}
	}
	if (mark != 0)
	{
	System.out.print("No");
	}

	return 0;
	}
}

