package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] n = new int[100];
	int[] m = new int[100];
	int i;
	int j;
	int[] s = new int[100];
	for (i = 1;n[i - 1] != 0,m[i - 1] != 0;i++)
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  (n[i]) = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  (m[i]) = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 1;n[i - 1] != 0,m[i - 1] != 0;i++)
	{
		s[i] = 0;
		for (j = 2;j <= n[i];j++)
		{
			s[i] = (s[i] + m[i]) % j;
		}
		if (n[i] != 0,m[i] != 0)
		{
		System.out.printf("%d\n", s[i] + 1);
		}
	}
	return 0;
	}

}

