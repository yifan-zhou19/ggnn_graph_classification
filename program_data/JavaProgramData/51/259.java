package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final String BeatFCbarcelona = "";
	final String substr = "";
	int[] halamadrid = new int[500];
	int k = 0;
	int[][] store =
	{
		{'\0', 0, 0}
	};
	int i;
	int j;
	int n;
	int len;
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		BeatFCbarcelona = tempVar2.charAt(0);
	}
	len = BeatFCbarcelona.length();
	for (i = 0;i < len - n + 1;i++)
	{
	for (j = 0;j < n;j++)
	{
	substr.charAt(i)[j] = BeatFCbarcelona.charAt(i + j);
	}
	}
	for (i = 0;i < len - n + 1;i++)
	{
	for (j = 0;j < len - n + 1;j++)
	{
	if (strcmp(substr.charAt(i),substr.charAt(j)) == 0)
	{
	halamadrid[i]++;
	}
	}
	}
	for (i = 0;i < len - n + 1;i++)
	{
	if (halamadrid[i] > max)
	{
	max = halamadrid[i];
	}
	}
	if (max > 1)
	{
	System.out.printf("%d\n",max);
	for (i = 0;i < len - n + 1;i++)
	{
	if (halamadrid[i] == max)
	{
	store[i] = substr.charAt(i);
	for (j = 0;j < i;j++)
	{
	if (strcmp(store[j],substr.charAt(i)) == 0)
	{
	k++;
	}
	}
	if (k == 0)
	{
	System.out.printf("%s\n",substr.charAt(i));
	}
	}
	k = 0;
	}
	}
	else
	{
		System.out.print("NO\n");
	}
	return 0;
	}
}

