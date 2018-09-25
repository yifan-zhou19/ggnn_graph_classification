package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[103]);
	int[] bcs = new int[100];
	int[] shang = new int[100];
	int len;
	int yu;
	int dq;
	int i;
	a = new Scanner(System.in).nextLine();
	len = 0;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
	bcs[i] = a.charAt(i) - '0';
	len++;
	}
	if (len == 1)
	{
	yu = bcs[0];
	System.out.print("0\n");
	System.out.printf("%d",yu);
	}
	else
	{
	for (i = 0;i < len - 1;i++)
	{
	if (i == 0)
	{
	dq = bcs[i] * 10 + bcs[i + 1];
	}
	else
	{
		dq = 10 * yu + bcs[i + 1];
	}
	shang[i + 1] = dq / 13;
	yu = dq % 13;
	}
	for (i = 1;i <= len - 1;i++)
	{
	if (shang[i] == 0 && i == 1 && len != 2)
	{
	continue;
	}
	if (i == len - 1)
	{
	System.out.printf("%d\n",shang[i]);
	}
	else
	{
	System.out.printf("%d",shang[i]);
	}
	}
	System.out.printf("%d\n",yu);
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	}

}

