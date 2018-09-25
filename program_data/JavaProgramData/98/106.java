package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		char[][] a = new char[1000][41];
		int[] b = new int[1000];
		int i;
		int s = 0;

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
			b[i] = String.valueOf(a[i]).length();
		}

		for (i = 0;i < n;i++)
		{
	//		int u=0;
			if (s == 0)
			{
				System.out.printf("%s",a[i]);
	//			u=0;
				s = b[i];
				i++;
			}
			s = s + b[i] + 1;
			if (s > 80)
			{
				System.out.print("\n");
				s = 0;
				i--;
	//			u=1;
				continue;
			}
			else
			{
				System.out.printf(" %s",a[i]);
			}
		}
	}
}

