package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ca = new String(new char[250]);
		String cb = new String(new char[250]);
		int[] a;
		int[] b;
		int[] c;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ca = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			cb = tempVar2.charAt(0);
		}
		l = ca.length();
		if (cb.length() > ca.length())
		{
			l = cb.length();
		}
		a = new int[l];
		b = new int[l];
		c = new int[(l + 1)];
		for (i = 0;i < l;i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
		}
		c[l] = 0;
		for (i = 0;i < ca.length();i++)
		{
			a[i] = ca.charAt(ca.length() - 1 - i) - '0';
		}
		for (i = 0;i < cb.length();i++)
		{
			b[i] = cb.charAt(cb.length() - 1 - i) - '0';
		}
		for (i = 0;i < l;i++)
		{
			c[i] = a[i] + b[i];
		}
		for (i = 0;i < l;i++)
		{
			if (c[i] >= 10)
			{

				c[i + 1] += (c[i] / 10);
				c[i] %= 10;
			}
		}
		j = -1;
		for (i = l;;i--)
		{
			if (c[i] != 0)
			{
				j = i;
				break;
			}
		}
		if (j < 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = j;i >= 0;i--)
			{
				System.out.printf("%d",c[i]);
			}
		}
			System.out.print("\n");



//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
		return 0;
	}
}

