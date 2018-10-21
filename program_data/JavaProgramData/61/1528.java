package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int j;
	int n;
	int[] z = new int[100];
	int[] m = new int[100];
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
			z[i] = Integer.parseInt(tempVar2);
		}
		a = 1;
		b = 1;
		if (z[i] == 1)
		{
			m[i] = 1;
		}
		else
		{
			if (z[i] == 2)
			{
				m[i] = 1;
			}
			else
			{
				for (j = 0;j < (z[i] - 2);j++)
				{
					m[i] = a + b;
					a = b;
					b = m[i];
				}
			}
		}
	}
	 for (i = 0;i < n;i++)
	 {
		  System.out.printf("%d\n",m[i]);
	 }
	  return 0;
	}


}

