package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j = 0;
		int n;
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
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		n = i;
		i = 0;
		do
		{
			if (b.charAt(j + i) != a.charAt(i))
			{
				j++,i = 0;
			}
			else if (b.charAt(j + i) == a.charAt(i))
			{
				i++;
			}
			else if (i == n)
			{
				break;
			}
			else
			{
			}
		}while (i != n);
		System.out.printf("%d",j);
	}
}

