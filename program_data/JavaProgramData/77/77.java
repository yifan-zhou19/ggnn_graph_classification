package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char c;
		int i;
		int j;
		int p;
		int n;
		int[] b = new int[100];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = j = 0;(c = str.charAt(i)) != '\0';i++)
		{
			 if (c != str.charAt(0))
			 {
				 b[j++] = i;
			 }
		}
		n = j;
		for (j = 0;j < n;j++)
		{
			if (str.charAt(b[j] - 1) == str.charAt(0))
			{
				a[j] = b[j] - 1;
			}
			else
			{
				for (i = b[j] - 1;;i--)
				{
				for (p = 0;p < j;p++)
				{
				if (i != a[p] && i != b[p])
				{
					continue;
				}
				else
				{
					break;
				}
				}
			if (p != j)
			{
				continue;
			}
			else if (str.charAt(i) == str.charAt(0))
			{
				a[j] = i;
				break;
			}
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d %d\n",a[j],b[j]);
		}
	}
}

