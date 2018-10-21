package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] root = new float[40];
		float[] male = new float[40];
		float[] famale = new float[40];
		char[][] name = new char[40][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k = 0;
		int p = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				root[i] = Float.parseFloat(tempVar3);
			}
			if (strcmp(name[i],"male") == 0)
			{
				male[k++] = root[i];
			}
			else
			{
				famale[p++] = root[i];
			}
		}
		float t;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j];
					male[j] = male[j + 1];
					male[j + 1] = t;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p - 1 - i;j++)
			{
				if (famale[j] < famale[j + 1])
				{
					t = famale[j];
					famale[j] = famale[j + 1];
					famale[j + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		System.out.printf("%.2f",famale[0]);
		if (p == 1)
		{
			;
		}
		else
		{
			for (i = 1;i < p;i++)
			{
				System.out.printf(" %.2f",famale[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

