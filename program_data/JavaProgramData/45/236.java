package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		for (i = 0;i <= n - m;i++)
		{
			for (j = 0;j < m;j++)
			{
		  c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i + j));
			}
		int[] num = new int[50];
		for (k = 0;k < m;k++)
		{
			if (c.charAt(k) == a.charAt(k))
			{
			num[k] = 1;
			}
		else
		{
			break;
		}
		}
		if (num[m - 1] == 1)
		{
			System.out.printf("%d\n",i);
		break;
		}
		}
	}
}

