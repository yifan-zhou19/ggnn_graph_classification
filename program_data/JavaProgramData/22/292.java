package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int j = 0;
		int i = 0;
		int k = 0;
		int p;
		int[] n = new int[305];
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (str.charAt(i) == ',' || str.charAt(i) == '\0')
			{
				for (p = j;p < i;p++)
				{
					x = Math.pow(10,i - p - 1);
					n[k] = n[k] + (str.charAt(p) - 48) * x;
				}
				j = i + 1;
				p = k + 1;
				k++;
			}
			if (str.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				continue;
			}
		}
		for (i = 0,j = 0;i < p;i++)
		{
			if (j < n[i])
			{
				j = n[i];
			}
		}
		for (i = 0;i < p;i++)
		{
			if (n[i] == j)
			{
				n[i] = 0;
			}
		}
		for (i = 0,k = 0;i < p;i++)
		{
			if (k < n[i])
			{
				k = n[i];
			}
		}
		{
				if (k == 0)
				{
					System.out.print("No");
				}
				else
				{
					System.out.printf("%d",k);
				}
		}
	}
}
