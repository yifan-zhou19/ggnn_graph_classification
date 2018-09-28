package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int k;
	int[] s = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(s,0,(Integer.SIZE / Byte.SIZE));
	for (k = 0;k < 1000;k++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
	for (i = 2;i <= n;i++)
	{
	s[i] = (s[i - 1] + m) % i;
	}
	if (m == 0)
	{
	break;
	}
	if (n == 1)
	{
	System.out.print("1\n");
	}
	else
	{
	System.out.printf("%d\n",s[n] + 1);
	}
	}
	}
}

