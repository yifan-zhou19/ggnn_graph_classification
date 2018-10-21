package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1600]);
		int[] n = new int[301];
		int i;
		int j = 0;
		int len;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ',')
			{
				n[j] = n[j] * 10 + a.charAt(i) - '0';
			}
			else
			{
				j++;
			}
		}
		len = j + 1;
		for (i = 0;i < len - 1;i++)
		{
			for (j = 0;j < len - i - 1;j++)
			{
				if (n[j] < n[j + 1])
				{
					t = n[j];
					n[j] = n[j + 1];
					n[j + 1] = t;
				}
			}
		}
		for (i = 1;i < len;i++)
		{
			if (n[0] != n[i])
			{
				break;
			}
		}
		if (i == len)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",n[i]);
		}
	}
}

