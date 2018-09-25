package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] shulie = new int[500];
	int[] jishu = new int[500];
	int n;
	int t = 0;
	int i = 0;
	int j = 0;
	int a = 0;
	int c = 0;
	int k = 0;
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
		  shulie[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 0;i < n;i++)
	{
	  if (shulie[i] % 2 != 0)
	  {
	   c++;
	  }
	}
	i = 0;
	for (j = 0;j < c;j++)
	{
		for (a = i;a < n;a++)
		{
			if (shulie[a] % 2 != 0)
			{
				jishu[j] = shulie[a];
				break;
			}
		}
		i = a + 1;
	}
	for (i = 0;i < c - 1;i++)
	{
		for (j = i + 1;j < c;j++)
		{
			if (jishu[i] > jishu[j])
			{
				t = jishu[i];
				jishu[i] = jishu[j];
				jishu[j] = t;
			}
		}
		System.out.printf("%d,",jishu[i]);
	}
	System.out.printf("%d",jishu[c - 1]);
	return 0;
	}
}

