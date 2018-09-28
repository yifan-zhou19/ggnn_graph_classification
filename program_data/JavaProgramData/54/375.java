package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i = 1;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.print("\n");
		do
		{
			s = i;
		 for (j = 1;j <= n;j++)
		 {
			   s = s * n;
			   s = s + k;
			if (s % (n - 1) != 0)
			{
				break;
			}
			else
			{
				s = s / (n - 1);
			}
		 }
			i++;
		} while (j < n);
		 System.out.printf("%d",s);
	}
}

