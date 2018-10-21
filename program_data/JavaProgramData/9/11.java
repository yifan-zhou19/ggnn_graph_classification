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
		char[][] id = new char[100][10];
		int[] age = new int[100];
		int oldno = 0;
		int[] xu = new int[100];
		char[][] shunxu = new char[100][10];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (age[j] >= 60)
			{
				xu[oldno] = age[j];
				shunxu[oldno] = id[j];
				oldno++;
			}
		}

		int num = oldno;
		int e;
		String tem = new String(new char[10]);
		for (int k = 0;k < n;k++)
		{
			if (age[k] < 60)
			{
				xu[oldno] = age[k];
				shunxu[oldno] = id[k];
				oldno++;
			}
		}
		for (int x = 1;x <= num;x++)
		{
			for (int y = 0;y < num - x;y++)
			{
				if (xu[y] < xu[y + 1])
				{
					e = xu[y];
					xu[y] = xu[y + 1];
					xu[y + 1] = e;
					tem = shunxu[y];
					shunxu[y] = shunxu[y + 1];
					shunxu[y + 1] = tem;
				}
			}
		}
		for (int z = 0;z < n;z++)
		{
			System.out.printf("%s\n",shunxu[z]);
		}
		return 0;
	}
}

