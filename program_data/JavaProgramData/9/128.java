package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		int j;
		int k;
		int[] old = new int[101];
		int oldn;
		int youngn;
		char[][] id =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] oldid =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] youngid =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (i = 1,j = 1,k = 1;i <= n;i++)
		{
			if (age[i] >= 60)
			{
				old[j] = age[i];
				oldid[j] = id[i];
				j++;
			}
			else
			{
				youngid[k] = id[i];
				k++;
			}
		}
		oldn = j;
		youngn = k;
		for (i = 1;i <= oldn;i++)
		{
			for (j = 1;j <= oldn - i;j++)
			{
				if (old[j] < old[j + 1])
				{
					old[100] = old[j];
					old[j] = old[j + 1];
					old[j + 1] = old[100];
					oldid[101] = oldid[j];
					oldid[j] = oldid[j + 1];
					oldid[j + 1] = oldid[101];
				}
			}
		}
		for (i = 1;i < oldn;i++)
		{
			System.out.printf("%s\n",oldid[i]);
		}
		for (k = 1;k < youngn;k++)
		{
			System.out.printf("%s\n",youngid[k]);
		}
	}
}

