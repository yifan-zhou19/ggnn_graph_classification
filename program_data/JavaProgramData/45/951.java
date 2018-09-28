package <missing>;

public class GlobalMembers
{
	public static String q = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static char[][] xc = new char[50][100];
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
		int p = 0;
		int qc;
		int ac;
		int bc;
		int r;
		qc = q.length();
		ac = a.length();
		bc = ac - qc;
		for (i = 0;i < bc + 1;i++)
		{

			for (j = 0;j < qc;j++)
			{
			  xc[i][j] = a.charAt(j + k);
			}
			k++;
			/*printf("%s\n",xc[i]);*/
		}

		for (r = 0;r < bc;r++)
		{
			p = strcmp(xc[r],q);
			if (p == 0)
			{
				break;
			}
		}

		System.out.printf("%d",r);
		return 0;

	}
}

