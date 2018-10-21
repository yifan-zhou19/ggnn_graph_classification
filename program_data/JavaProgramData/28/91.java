package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		int i = 1;
		int m = 0;
		int[] len = new int[300];
		char c;
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len[0] = str.length();
		while ((c = System.in.read()) != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len[i] = str.length();
			i++;
		}
		m = i;
		if (m == 1)
		{
			System.out.printf("%d",len[0]);
		}
		else
		{
			System.out.printf("%d,%d,",len[0],len[1]);
			for (i = 2;i < m - 1;i++)
			{
			System.out.printf("%d,",len[i]);
			}
			System.out.printf("%d",len[m - 1]);
		}
	}


}

