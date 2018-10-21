package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
	int n = 0;
	int[] b = new int[100];
	int[] s = new int[100];
	int e;
	int d;
	int max;
	int min;
	int i;
	b[0] = -1;
	a = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		if (a.charAt(i) == ' ')
		{
		n = n + 1;
	b[n] = i;
		}
	}
	for (i = b[n] + 1;a.charAt(i) != '\0';i++)
	{
	}
	n = n + 1;
	b[n] = i;
	for (i = 1;i <= n;i++)
	{
	s[i] = b[i] - b[i - 1] - 1;
	}
	max = s[1];
	min = s[1];
	for (i = 1;i <= n;i++)
	{
		if (max < s[i])
		{
	max = s[i];
		}
	if (min > s[i])
	{
	min = s[i];
	}
	}
	for (i = 1;i <= n;i++)
	{
		if (s[i] == max)
		{
		d = i;
		break;
		}
	}
	for (i = b[d - 1] + 1;i < b[d];i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	System.out.print("\n");
	for (i = 1;i <= n;i++)
	{
		if (s[i] == min)
		{
		e = i;
		break;
		}
	}
	for (i = b[e-1] + 1;i < b[e];i++)
	{
	System.out.printf("%c",a.charAt(i));
	}
	return 0;
	}

}
