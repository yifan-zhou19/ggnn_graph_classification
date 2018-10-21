package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s;
		int i;
		int[] a = new int[200];
		int[] b = new int[200];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	s = 0;
	m = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (a[i] == 1 && b[i] == 0)
	{
			s++;
	}
	if (a[i] == 0 && b[i] == 2)
	{
			s++;
	}
	if (a[i] == 2 && b[i] == 1)
	{
			s++;
	}
	if (a[i] == 0 && b[i] == 1)
	{
			m++;
	}
	if (a[i] == 1 && b[i] == 2)
	{
			m++;
	}
	if (a[i] == 2 && b[i] == 0)
	{
			m++;
	}
	}
	if (s > m)
	{
		System.out.print("B");
	}
	if (s == m)
	{
		System.out.print("Tie");
	}
	if (s < m)
	{
		System.out.print("A");
	}


	return 0;
	}



}

