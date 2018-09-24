package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] num = new int[301];
		int sum = 0;
		String a = new String(new char[301]);
		char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < 27;i++)
		{
			num[i] = 0;
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == letter[i])
				{
					num[i]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",letter[i],num[i]);
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

