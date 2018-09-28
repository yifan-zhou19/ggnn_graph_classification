package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		int length_a = a.length();
		int length_b = b.length();
		int i;
		int j;
		int k = 1;
		String p;
		p = b;
		for (i = 0;i <= length_b - length_a;i++)
		{
			for (j = 0;j < length_a;j++)
			{
				if (a.charAt(j) != *(p.Substring(i) + j))
				{
				k = 0;
				break;
				}
			}
			if (k == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else
			{
				k = 1;
			}
		}
	}
}

