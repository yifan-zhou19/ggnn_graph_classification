package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String st1 = new String(new char[100]);
	String st2 = new String(new char[100]);
	int i;
	int n;
	int m;
	int[] n1 = new int[128];
	int[] n2 = new int[128];

	for (i = 0;i < 100;i++)
	{
		st1 = st1.substring(0, i);
	st2 = st2.substring(0, i);
	}
	for (i = 0;i < 128;i++)
	{
		n1[i] = 0;
	n2[i] = 0;
	}

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		st1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		st2 = tempVar2.charAt(0);
	}

	for (i = 0;i < 100;i++)
	{
		n = st1.charAt(i);
	m = st2.charAt(i);

	n1[n]++;
	n2[m]++;
	}
	n = 0;
	for (i = 0;i < 128;i++)
	{
		if (n1[i] == n2[i])
		{
		n = n + 1;
		}
	}
	if (n == 128)
	{
	System.out.print("YES\n");
	}
	else
	{
	System.out.print("NO\n");
	}


	}
}

