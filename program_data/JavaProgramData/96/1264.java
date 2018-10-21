package <missing>;

public class GlobalMembers
{
	public static void sti(tangible.RefObject<String> str, int[] s)
	{
		int len = str.argValue.length();
		for (int i = 0;i < len;i++)
		{
			s[i] = (int)(str.argValue.charAt(i) - '0');
		}
	}
	public static int Main()
	{
		String s = new String(new char[max + 2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int[] a = new int[max + 2];
		int[] b = new int[max + 2];
		int len = s.length();
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
		sti(tempRef_s, a);
		s = tempRef_s.argValue;
		if (len == 1)
		{
			System.out.printf("%d\n%d\n",0,a[0]);
		}
		else if (len == 2)
		{
			System.out.printf("%d\n%d\n",(10 * a[0] + a[1]) / 13,(10 * a[0] + a[1]) % 13);
		}
		else
		{
			for (int i = 0;i < len - 1;i++)
			{
				b[i] = (10 * a[i] + a[i + 1]) / 13;
				a[i + 1] = (10 * a[i] + a[i + 1]) % 13;
			}
			int k = 0;
			while (b[k] == 0)
			{
				k++;
			}
			for (int i = k;i < len - 1;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.printf("\n%d",a[len - 1]);
		}

	}
}

