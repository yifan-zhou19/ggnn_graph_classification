package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int i;
	int j;
	int t;
	j = 0;
	t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i = i + 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((a >= 90 && a <= 140) && (b >= 60 && b <= 90))
		{
			 j = j + 1;
		}
		else
		{
			 if (t < j)
			 {
				 t = j;
				 j = 0;
			 }
			 else
			 {
				 j = 0;
			 }
		}
	}
	if (t < j)
	{
		t = j;
	}
	System.out.printf("%d",t);
	return 0;
	}
}

