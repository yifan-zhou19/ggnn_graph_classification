package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ha = new int(int n,int m);
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				n = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",ha(a[i], b[i]));
		}
	}
	public static int ha(int n,int m)
	{
		int[] a = new int[300];
		int i;
		int t = 0;
		int k = 0;
		int l;
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		if (n == 1)
		{
			k = 1;
		}
		else
		{
			i = 0;
			l = 1;
		do
		{
				if (a[i] != 0 && l == m)
				{
				a[i] = 0;
				t++;
				l = 1;
				}
			else if (a[i] != 0)
			{
				l++;
			}
			if (i < n - 1)
			{
				i++;
			}
			else
			{
				i = 0;
			}

		}while (t < n - 1);
		for (i = 0;i < n;i++)
		{
			k = k + a[i];
		}
		}
		return (k);
	}



}

