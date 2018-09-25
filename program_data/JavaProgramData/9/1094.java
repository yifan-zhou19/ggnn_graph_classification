package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[100];
		int[] oage = new int[100];
		char[][] ID = new char[100][10];
		char[][] old = new char[100][10];
		char[][] young = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ID[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		int k = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				young[k] = ID[i];
				k++;
			}
			else
			{
				oage[j] = age[i];
				old[j] = ID[i];
				j++;
			}
		}
		for (i = 150;i >= 60;i--)
		{
			for (m = 0;m < j;m++)
			{
				if (oage[m] == i)
				{
					System.out.printf("%s\n",old[m]);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",young[i]);
		}
		return 0;
	}


}

