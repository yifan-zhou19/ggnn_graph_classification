package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int j;
			int k;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}

			char[][] id = new char[100][10];
			int[] old = new int[100];

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
						old[i] = Integer.parseInt(tempVar3);
					}
			}

			int e;
			char[][] s = new char[100][10];
			for (j = 1;j < n;j++)
			{
	   for (k = 0;k < n - j;k++)
	   {
		if (old[k] < old[k + 1] && old[k + 1] >= 60)
		{
		 e = old[k + 1];
		 old[k + 1] = old[k];
		 old[k] = e;
			 s[k] = id[k + 1];
			id[k + 1] = id[k];
		id[k] = s[k];
		}
	   }
			}
			for (i = 0;i < n;i++)
			{
					System.out.printf("%s\n",id[i]);
			}


			return 0;
	}

}

