package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] old = new int[100];
		int[] t = new int[100];
		char[][] num =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] temp =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int x;
		int z = 0;
		char[] y = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
				num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				old[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		  if (old[i] >= 60)
		  {
			temp[z] = num[i];
			t[z] = old[i];
			z++;
		  }
		}
		for (i = 0;i < z;i++)
		{
		  for (j = z - 1;j > i;j--)
		  {
			if (t[j] > t[j - 1])
			{
			   x = t[j];
			   t[j] = t[j - 1];
			   t[j - 1] = x;
			   y = temp[j - 1];
			   temp[j - 1] = temp[j];
			   temp[j] = y;
			}
		  }
		}
		for (i = 0;i < z;i++)
		{
			System.out.printf("%s\n",temp[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (old[i] < 60)
			{
			System.out.printf("%s\n",num[i]);
			}
		}
		return 0;
	}
}

