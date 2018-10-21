package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char p;
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		p = a.charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == p)
			{
				b[j++] = i;
			}
			else
			{
				c[k++] = b[j - 1];
				c[k++] = i;
				j--;
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if ((i % 2) == 0)
			{
				System.out.printf("%d ",c[i]);
			}
			else
			{
				System.out.printf("%d\n",c[i]);
			}
		}
		return 0;
	}
}

