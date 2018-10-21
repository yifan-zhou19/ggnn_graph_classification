package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
		int s = 1;
		int t;
		int k = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		do
		{
			t = 1;
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) != b.charAt(j))
				{
					s = 0;
					t = t * s;
				}
				j++;
			}
			k++;
			j = k;
		}while (t == 0);
		k = k - 1;
		System.out.printf("%d",k);
	}
}

