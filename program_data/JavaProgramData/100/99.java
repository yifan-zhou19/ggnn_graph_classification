package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		String a = new String(new char[300]);
		int i;
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int m;
		int yes = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
	m = a.length();

	for (i = 0;i < m;i++)
	{
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
			yes = 1;
	b[a.charAt(i) - 'a']++;
		}
	}
	if (yes == 0)
	{
	System.out.print("No\n");
	}
	for (i = 0;i < 26;i++)
	{
		if (b[i] != 0)
		{
		System.out.printf("%c=%d\n",(i + 'a'),b[i]);
		}
	}


	 }
}

