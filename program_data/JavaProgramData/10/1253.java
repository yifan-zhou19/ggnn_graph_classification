package <missing>;

public class GlobalMembers
{
	public static char max(String a, char i)
	{
		char j;
		char m = a[0];
		for (j = 1;j < i;j++)
		{
			if (m < a[j])
			{
				m = a[j];
			}
		}
		return (m);
	}

	public static void Main()
	{
		int[] h = new int[N];
		char n;
		char i;
		char j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		for (i = n;i >= 1;i--) //nixu!!
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		char[] mis = {0};
		char[] temp = {0};
		mis[0] = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= i - 1;j++) //the most that is below h[i]
			{
				if (h[i] >= h[j])
				{
					temp[j] = mis[j] + 1;
				}
				else
				{
					temp[j] = 0;
				}
			}
			mis[i] = max(temp, i);
		}
		for (i = 0;i <= n;i++)
		{
			System.out.printf("%d ",mis[i]);
		}
		System.out.printf("%d",max(mis, n + 1));


	}
}

