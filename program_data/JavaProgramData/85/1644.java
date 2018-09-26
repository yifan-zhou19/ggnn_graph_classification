package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int p;
	int i;
	int n;
	int l;
	int[] a = new int[10000];
	int k;
	char[][] q = new char[10000][20];
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
			q[i] = tempVar2.charAt(0);
		}
	a[i] = 1;
	}
	for (i = 0;i < n;i++)
	{
		k = String.valueOf(q[i]).length();
	for (l = 0;l < k;l++)
	{
		p = q[i][l];
	if (l == 0)
	{
		if (((p >= 65) && (p <= 90)) || ((p >= 97) && (p <= 122)) || (p == 95))
		{
		continue;
		}
	else
	{
		a[i] = 0;
	break;
	}
	}
	else
	{
		if (((p >= 65) && (p <= 90)) || ((p >= 97) && (p <= 122)) || ((p >= 48) && (p <= 57)) || (p == 95))
		{
		continue;
		}
	else
	{
		a[i] = 0;
	break;
	}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] == 1)
		{
		System.out.print("yes\n");
		}
	else if (a[i] == 0)
	{
		System.out.print("no\n");
	}
	}


	  return 0;
	}

}

