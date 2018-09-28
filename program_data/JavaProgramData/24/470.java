package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int maxlen = 0;
		int minlen;
		int max = 0;
		int min = 0;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		minlen = String.valueOf(a[0]).length();
		for (j = 0;j < i;j++)
		{
			if (String.valueOf(a[j]).length() > maxlen)
			{
				maxlen = String.valueOf(a[j]).length();
				max = j;
			}
			if (String.valueOf(a[j]).length() < minlen)
			{
				minlen = String.valueOf(a[j]).length();
				min = j;
			}
		}
		System.out.printf("%s\n%s",a[max],a[min]);
	}
}

