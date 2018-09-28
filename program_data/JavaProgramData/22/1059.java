package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int second = new int(int a[],int n);
		int k = 0;
		int[] a = new int[300];
		int num = 0;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[k++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			num++;
		} while (c != '\n');
		if (second(a, num) != -1)
		{
			System.out.printf("%d",second(a, num));
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
	public static int second(int[] a, int n)
	{
		int max = a[0];
		int k = 1;
		int next = -1;
		while (k < n)
		{
			if (a[k] > max)
			{
				next = max;
				max = a[k];
			}
			if (a[k] < max && a[k]> next)
			{
				next = a[k];
			}
			k++;
		}
		if (next != -1)
		{
			return next;
		}
		else
		{
			return (-1);
		}
	}
}

