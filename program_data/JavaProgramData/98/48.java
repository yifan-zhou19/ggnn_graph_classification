package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int a;
		int n;
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] para =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		para[k] += word[0];
		for (i = 1;i < n;i++)
		{
			if (String.valueOf(para[k]).length() + String.valueOf(word[i]).length() + 1 <= 80)
			{
				para[k] += " ";
				para[k] += word[i];
			}
			else
			{
				//printf("%d", strlen(para[k]));
				k++;
				para[k] += word[i];
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%s\n", para[i]);
		}
		return 0;
	}
}

