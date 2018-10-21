package <missing>;

public class GlobalMembers
{
	/*????*/
	public static void doit(String a, int n)
	{
		int i;
		int j;
		for (i = 1;i < n;i++)
		{
			if (!a[i].equals(a[0]) && !a[i].equals('\0'))
			{
				break;
			}
		}
		for (j = i - 1;j > -1;j--)
		{
			if (a[j].equals(a[0]))
			{
				break;
			}
		}
		System.out.printf("%d %d\n",j,i);
		a[j] = '\0',a[i] = '\0';
		if (!a[0].equals('\0'))
		{
			doit(a, n);
		}
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		doit(a, n);
	}


}

