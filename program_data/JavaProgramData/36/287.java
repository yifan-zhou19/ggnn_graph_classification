package <missing>;

public class GlobalMembers
{
	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (array[j] < array[k])
				{
					k = j;
				}
			}
				if (k != i)
				{
					t = array[i];
					array[i] = array[k];
					array[k] = t;
				}
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		int l1;
		int l2;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1;i++)
		{
			a1[i] = (int)a.charAt(i);
		}
		for (j = 0;j < l2;j++)
		{
			b1[j] = (int)b.charAt(j);
		}
		sort(a1, l1);
		sort(b1, l2);
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (a1[i] != b1[i])
				{
					System.out.print("NO");
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("YES");
			}
		}
	}
}

