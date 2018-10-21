package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int c;
		int d;
		int[] a = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
	int p1;
	String b = new String(new char[100001]);
	String p2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		b = new Scanner(System.in).nextLine();
	p1 = a;
	for (j = 0;j < 26;j++)
	{
	*(p1 + j) = 0;
	}
	j = 0;
	p2 = b;
	while (*(p2.Substring(j)) != '\0')
	{
		d = (p1 + *(p2.Substring(j)) - 97);
	d++;
	*(p1 + *(p2.Substring(j)) - 97) = d;
	j++;
	}
	j = 0;
	c = 0;
	while (*(p2.Substring(j)) != '\0')
	{
		if (*(p1 + *(p2.Substring(j)) - 97) == 1)
		{
			System.out.printf("%c\n",*(p2.Substring(j)));
			c = 1;
			break;
		}
	j++;
	}
	if (c == 0)
	{
		System.out.print("no\n");
	}
	}
	return 0;
	}
}

