package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t = 0;
		int s = 0;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				s = a[j] + j * 3;
				t = a[j];
				if (s > 60)
				{
					t = 60 - j * 3;
					break;
				}
				s = s + 3;
				if (s > 60)
				{
					break;
				}
			}
			if (s < 60)
			{
				t = t + 60 - s;
			}
			System.out.printf("%d\n",t);
		}
		return 0;
	}

}

