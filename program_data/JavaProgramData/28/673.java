package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zf = new char[300][100];
		int i;
		int j;
		int[] len = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zf[0] = tempVar.charAt(0);
		}
		len[0] = String.valueOf(zf[0]).length();
		System.out.printf("%d",len[0]);
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(zf[i]).length();
			if (len[i] == 0)
			{
			break;
			}
			System.out.printf(",%d",len[i]);

		}
		return 0;
	}
}

