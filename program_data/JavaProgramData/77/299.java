public class dui
{
	public int nannv;
public int weizhi;
}

package <missing>;

public class GlobalMembers
{
	public static dui[] a = tangible.Arrays.initializeWithDefaultduiInstances(100);
	public static void shuchu(dui[] a, int n)
	{
		int i = 1;
		int j;
		int h = 1;
		do
		{
			if (a[i].nannv == 0)
			{
				System.out.printf("%d %d\n",a[i - 1].weizhi - 1,a[i].weizhi - 1);
				if (i < n)
				{
					for (j = i;j <= n;j++)
					{
						a[j - 1] = a[j + 1];
						a[j] = a[j + 2];
						j++;
					}
					n = n - 2;
				}
				else
				{
					n = 0;
				}
				i = 1;
			}
			else
			{
				i++;
			}
		}while (n != 0);
	}
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int k = 0;
		String s = new String(new char[100]);
		char nan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.length();
		nan = s.charAt(0);
		for (i = 1;i <= n;i++)
		{
			if (s.charAt(i - 1) == nan)
			{
				a[i].nannv = 1;
				a[i].weizhi = i;
			}
			else
			{
				a[i].nannv = 0;
				a[i].weizhi = i;
			}
		}
		shuchu(a, n);
	}
}

