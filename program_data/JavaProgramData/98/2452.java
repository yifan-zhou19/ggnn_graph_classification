package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		char[][] w = new char[500][100];
		int[] l = new int[500];
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(w[i]).length();
		}
		//for(i=1;i<=n;i++)
		//{
		//	printf("%s ",w[i]);
		//	printf("%d ",l[i]);
		//}
		for (i = 0;;i++)
		{
			System.out.printf("%s",w[j]);
			s[i] = l[j];
			j++;
			if (j == n + 1)
			{
				break;
			}
			while (s[i] + l[j] + 1 <= 80)
			{
				System.out.printf(" %s",w[j]);
				s[i] = s[i] + 1 + l[j];
				j++;
				if (j == n + 1)
				{
					break;
				}
			}
			System.out.print("\n");
			if (j == n + 1)
			{
				break;
			}
		}
		return 0;
	}
}

