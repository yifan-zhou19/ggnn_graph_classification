package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] n = new int[800];
	int[] m = new int[800];
	int i;
	int k;
	int l = 0;
	int s = 0;
	for (k = 0;1;k++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[k] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[k] = Integer.parseInt(tempVar2);
		}
		if (n[k] == 0 && m[k] == 0)
		{
		break;
		}
	}
	for (k = 0;1;k++)
	{
		if (n[k] == 0 && m[k] == 0)
		{
	break;
		}
	else if (n[k] == 1)
	{
	System.out.printf("%d\n",n[k]);
	}
	else
	{
		for (i = 2; i <= n[k]; i++)
		{
			s = (s + m[k]) % i;
		}
	System.out.printf("%d\n", s + 1);
	s = 0;
	}
	}
	}

}

