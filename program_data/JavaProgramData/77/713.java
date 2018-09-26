package <missing>;

public class GlobalMembers
{
	public static void a(String t, int k)
	{
		int i;
		int j;
	if (!t[0].equals(0))
	{
		for (i = 0;i < k - 1;i++)
		{
		if (t[i].equals(0))
		{
	continue;
		}
	j = i + 1;
	while (t[j].equals(0))
	{
		j++;
	}
	if (!t[i].equals(t[j]))
	{
		System.out.print(i);
		System.out.print(" ");
		System.out.print(j);
		System.out.print("\n");
	t[i] = null;
	t[j] = null;
	break;
	}
		}
	a(t, k);
	}


	}
	public static int Main()
	{
		String t = new String(new char[100]);
	int i;
	int k;
	for (i = 0;i < 100;i++)
	{
	t = t.substring(0, i);
	}
	t = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (i = 0;i < 100;i++)
	{
		if (t.charAt(i) == 0)
		{
	break;
		}
	}
	k = i;
	a(t, k);

	return 0;


	}

}

