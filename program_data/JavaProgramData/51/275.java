package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int n;
	int k = 1;
	int[] num = new int[500];
	String text = new String(new char[501]);
	char[][] s = new char[500][6];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	text = new Scanner(System.in).nextLine();
	for (i = 0;i < text.length() + 1 - n;i++)
	{
		num[i] = 1;
		for (j = 0;j < n;j++)
		{
			s[i][j] = text.charAt(i + j);
		}
		s[i][n] = '\0';
	}
	for (i = 0;i < text.length() + 1 - n;i++)
	{
		for (j = i + 1;j < text.length() + 1 - n;j++)
		{
	   if (strcmp(s[i],s[j]) == 0)
	   {
		num[i]++;
		num[j]--;
	   }
		}
	}
	for (i = 0;i < text.length() + 1 - n;i++)
	{
		if (num[i] > k)
		{
			k = num[i];
		}
	}
	if (k == 1)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",k);
	for (i = 0;i < text.length() - n;i++)
	{
		if (num[i] == k)
		{
			System.out.printf("%s\n",s[i]);
		}
	}
	}
	}



}

