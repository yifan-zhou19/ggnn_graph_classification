package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char b;
		int i;
		int max = 0;
		int min = 0;
		for (i = 0;i < 50;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b == 10)
			{
				break;
			}
		}
		for (i = 0;i < 50;i++)
		{
			if (String.valueOf(a[i]).length() > String.valueOf(a[max]).length())
			{
				max = i;
			}
			else if (String.valueOf(a[i]).length() < String.valueOf(a[min]).length() && String.valueOf(a[i]).length() != 0)
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s",a[max],a[min]);
		return 0;
	}
}

