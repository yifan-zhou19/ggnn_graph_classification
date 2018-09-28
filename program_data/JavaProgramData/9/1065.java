package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int[] b = new int[100];
		int n1 = 0;
		int n2 = 0;
		int[] ha = new int[100];
		int[] pp = new int[100];
		int x;
		char[][] a = new char[100][11];
		char[][] yi = new char[100][10];
		char[][] er = new char[100][10];
		String y = new String(new char[11]);
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				n1++;
			}
			else
			{
				n2++;
			}
		}
		for (i = 0,k = 0,l = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				ha[k] = b[i];
				yi[k] = a[i];
				k++;
			}
			else
			{
					pp[l] = b[i];
					er[l] = a[i];
					l++;
			}
		}
		for (i = 1;i < n1;i++)
		{
			for (k = 0;k < n1 - i;k++)
			{
				if (ha[k] < ha[k + 1])
				{
					x = ha[k];
					ha[k] = ha[k + 1];
					ha[k + 1] = x;
					y = yi[k];
					yi[k] = yi[k + 1];
					yi[k + 1] = y;
				}
			}
		}
		for (i = 0;i < n1;i++)
		{
			System.out.printf("%s\n",yi[i]);
		}
		for (i = 0;i < n2;i++)
		{
			System.out.printf("%s\n",er[i]);
		}
		return 0;
	}






}

