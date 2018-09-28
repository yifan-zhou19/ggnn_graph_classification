package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int[] a = new int[maxl + 1];
		int[] ans = new int[maxl + 1];
		String s = new String(new char[maxl + 1]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			a[i] = s.charAt(i) - '0';
		}
		l = i;
		for (i = 0;i <= l - 1;i++)
		{
			a[i + 1] = (a[i] % b) * 10 + a[i + 1];
			ans[i] = a[i] / b;
		}
		i = 0;
		while ((ans[i] == 0) && (i <= l - 1))
		{
		i++;
		}
		if (i == l)
		{
			System.out.print("0");
		}
		else
		{
		for (;i <= l - 1;i++)
		{
		  System.out.printf("%d",ans[i]);
		}
		}
		System.out.print("\n");
		System.out.printf("%d\n",a[l] / 10);
	}

}

