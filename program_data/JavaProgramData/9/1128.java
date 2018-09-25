package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int slotnum;
		String slot = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] s1 = new char[100][100];
		int[] s2 = new int[100];
		char[][] a1 = new char[100][100];
		int[] a2 = new int[100];
		int anum = 0;
		char[][] b1 = new char[100][100];
		int[] b2 = new int[100];
		int bnum = 0;
		for (i = 0,j = 0,k = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s2[i] = Integer.parseInt(tempVar3);
			}
			if (s2[i] >= 60)
			{
				a1[j] = s1[i];
				a2[j] = s2[i];
				j++;
				anum++;
			}
			if (s2[i] < 60)
			{
				b1[k] = s1[i];
				b2[k] = s2[i];
				k++;
				bnum++;
			}
		}

		for (i = anum - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a2[j] < a2[j + 1])
				{
					slot = a1[j];
					a1[j] = a1[j + 1];
					a1[j + 1] = slot;
					slotnum = a2[j];
					a2[j] = a2[j + 1];
					a2[j + 1] = slotnum;
				}
			}
		}

		for (i = 0;i < anum;i++)
		{
			System.out.printf("%s\n",a1[i]);
		}
		for (i = 0;i < bnum;i++)
		{
			System.out.printf("%s\n",b1[i]);
		}

		return 0;
	}
}

