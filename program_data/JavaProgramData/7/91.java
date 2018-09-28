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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
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
		int js = 0;
		int[] sz = new int[100];
		int x;
		int y;
		int z;
		int npc;
		qc = q.length();
		ac = a.length();
		bc = qc - ac;
		for (i = 0;i < bc + 1;i++)
		{

			for (j = 0;j < ac;j++)
			{
			  xc[i][j] = q.charAt(j + k);
			}
			k++;
			p = strcmp(xc[i],a);
			if (p == 0)
			{
			sz[js] = i;
			js++;
			}
		/*printf("%s\n",xc[i]);*/
		}
		npc = sz[0];

		if (js == 0)
		{
		System.out.printf("%s\n",q);
		}
		if (js != 0)
		{
			for (x = 0;x < npc;x++)
			{
				System.out.printf("%c",q.charAt(x));
			}
				System.out.printf("%s",b);
			for (z = npc + ac;z < qc;z++)
			{
				System.out.printf("%c",q.charAt(z));
			}
		}
		return 0;

	}


}

