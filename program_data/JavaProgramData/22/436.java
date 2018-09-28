package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int max;
	int sec;
	int k = 0;
	int[] c = new int[300];
	String a = new String(new char[300]);
	for (i = 0;i < 300;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
	}
	k++;
	if (a.charAt(i) == '\n')
	{
	break;
	}
	}
	if (k != 1)
	{
	for (i = k - 1;i >= 0;i--)
	{
	if (c[i] != c[0])
	{
	break;
	}
	k--;
	}
	}
	max = c[0];
	for (i = 1;i < k;i++)
	{
		if (c[i] > max)
		{
		  max = c[i];
		}
	}
	if (k == 1 || k == 0)
	{
	System.out.print("No");
	}
	else
	{
		sec = 0;
		for (i = 0;i < k;i++)
		{
			if (c[i] < max && c[i]> sec)
			{
			sec = c[i];
			}
		}
		System.out.printf("%d",sec);
	}
	}
}

