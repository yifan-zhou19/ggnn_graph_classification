package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		char[][] id = new char[100][10];
		int[] age = new int[100];
		char[][] oid = new char[100][10];
		int[] oage = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
			 int k = 0;
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 60)
			{
					oage[k] = age[i];
					oid[k] = id[i];
					k++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
							if (oage[j] < oage[j + 1])
							{
					int e;
					e = oage[j];
					oage[j] = oage[j + 1];
					oage[j + 1] = e;
					String f = new String(new char[10]);
					f = oid[j];
					oid[j] = oid[j + 1];
					oid[j + 1] = f;
							}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",oid[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				System.out.printf("%s\n",id[i]);
			}
		}
		return 0;
	}


}

