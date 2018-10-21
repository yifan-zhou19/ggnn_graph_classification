package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String m = new String(new char[100]);
	   String a = new String(new char[100]);
		m = new Scanner(System.in).nextLine();
	int n = Integer.parseInt(m);
	int t;
	int i;
	int k;
	int j;
		for (i = 0;i < n;i++)
		{
		a = new Scanner(System.in).nextLine();
	for (k = 0;a.charAt(k) != '\0';k++)
	{
		t = 1;
		for (j = 0;a.charAt(j) != '\0';j++)
		{
			if (j == k)
			{
				continue;
			}
			else
			{
			if (a.charAt(j) == a.charAt(k))
			{
			t = 0;
				break;
			}
			}
		}
		if (t != 0)
		{
			System.out.printf("%c\n",a.charAt(k));
			break;
		}
	}
	if (t == 0)
	{
		System.out.print("no\n");
	}
		}
		return 0;
	}
}
